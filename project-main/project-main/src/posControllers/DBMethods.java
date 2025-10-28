
package posControllers;

import java.sql.Timestamp;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import posControllers.DBControllers;
import posClasses.EmployeeModel;
import posClasses.ProductModel;
import posClasses.Session;

public class DBMethods {
    Connection con;
    Statement st;
    PreparedStatement std;
    
    public void Login(JTextField userField, JPasswordField passField, mainFrame parent, Connection conn, Session session){
        String userInput; char[]passInput;
        
        userInput = userField.getText();
        passInput = passField.getPassword();
        
        String pass = new String(passInput);
        String queryLogin = """
            SELECT a.employee_id, e.role, r.role_name
            FROM accounts a
            JOIN employees e ON a.employee_id = e.employee_id
            JOIN roles r ON e.role = r.role_id
            WHERE a.username = ? AND a.password = ?
            """;
      
        try (PreparedStatement pst = conn.prepareStatement(queryLogin)) { 
            pst.setString(1, userInput);
            pst.setString(2, pass);
            
            ResultSet rs = pst.executeQuery(); 
            
            if(!rs.next()){
                JOptionPane.showMessageDialog(null, "Invalid username & password");
            } else{
                JOptionPane.showMessageDialog(null, "Sucessful Login");
                
                //Store session info
                session.SetCurrentUser(userInput); session.SetCashierId(rs.getInt("employee_id")); session.SetCurrentRole(rs.getInt("role"));
                
                //Show main dashboard
                parent.showPage("CashierPanel");
            }
        
        } catch (SQLException ex) {
            ex.printStackTrace();
            
        }
    }
    public void loadTableDataItems(JTable tableName) {
        Connection conn = DBControllers.getConnection();
        DefaultTableModel model = new DefaultTableModel();
    
        // Define your column headers
        model.setColumnIdentifiers(new Object[]{"OrderID", "Product Name", "Quantity Sold", "Total Price", "Date Sold"});
    
        try {
            String query = "SELECT s.sale_id, p.product_name, si.quantity, p.product_price, " +
                        "(si.quantity * p.product_price) AS total_price, s.date " +
                        "FROM sales s " +
                        "JOIN sales_items si ON s.sale_id = si.sale_id " +
                        "JOIN products p ON si.product_id = p.product_id " +
                        "ORDER BY s.sale_id ASC";
            PreparedStatement pst = conn.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
        
        // Loop through result set and add each row to the model
            while (rs.next()) {
              model.addRow(new Object[]{
                    rs.getLong("sale_id"),
                    rs.getString("product_name"),
                    rs.getInt("quantity"),
                    rs.getDouble("total_price"),
                   rs.getTimestamp("date")
               });
            }
        
            tableName.setModel(model); // Assign model to JTable
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void loadTableDataEmp(JTable tableName){
        Connection conn = DBControllers.getConnection();
        DefaultTableModel model = new DefaultTableModel();
    
        model.setColumnIdentifiers(new Object[]{"Employee I.D.", "First Name", "Last Name", "Role", "Username", "Password"});
        
            String sql = """
                SELECT 
                    e.employee_id, e.fname, e.lname, r.role_name, a.username, a.password
                FROM employees e
                JOIN roles r ON e.role = r.role_id
                JOIN accounts a ON e.employee_id = a.employee_id
                ORDER BY e.employee_id ASC
                """;
        
            try (PreparedStatement pst = conn.prepareStatement(sql);ResultSet rs = pst.executeQuery()) {
            
            while (rs.next()) {
                int empId = rs.getInt("employee_id");
                String fname = rs.getString("fname");
                String lname = rs.getString("lname");
                String role = rs.getString("role_name");
                String username = rs.getString("username");
                String password = rs.getString("password");

                // Add row to model
                model.addRow(new Object[]{empId, fname, lname, role, username, password});
            }
            // Set model to table
            tableName.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading employee data!");
        }
    }
    
    public void loadEmpData(JTable EmployeeTable, JComboBox PositionBox, JTextField empIDfield, JTextField fnamefield, JTextField lnamefield, JTextField usernamefield, JTextField passwordfield){
        int selectedRow = EmployeeTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a row first!");
            return;
        }

        TableModel model = EmployeeTable.getModel();

        int empID = Integer.parseInt(model.getValueAt(selectedRow, 0).toString());
        String fname = model.getValueAt(selectedRow, 1).toString();
        String lname = model.getValueAt(selectedRow, 2).toString();
        String role = model.getValueAt(selectedRow, 3).toString();
        String username = model.getValueAt(selectedRow, 4).toString();
        String password = model.getValueAt(selectedRow, 5).toString();

        empIDfield.setText(String.valueOf(empID));
        fnamefield.setText(fname);
        lnamefield.setText(lname);
        usernamefield.setText(username);
        passwordfield.setText(password);

        switch (role.toLowerCase()) {
            case "admin" -> PositionBox.setSelectedIndex(0);
           case "manager" -> PositionBox.setSelectedIndex(1);
            case "cashier" -> PositionBox.setSelectedIndex(2);
            default -> PositionBox.setSelectedIndex(-1);
        }
    }
    
    
    public void insertSaletoDatabase(JTable listOfOrders,long saleId, int cashierId, Timestamp date ) {
        
        Connection conn = DBControllers.getConnection();

        try{
            String sql = "INSERT INTO sales (sale_id, date, cashier_id) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            
            pst.setLong(1, saleId);
            pst.setTimestamp(2, date);
            pst.setInt(3, cashierId);
            pst.executeUpdate();
            
        }catch(SQLException e){e.printStackTrace();}

        try {
            String sql = "INSERT INTO sales_items (sale_id, product_id, quantity) VALUES (?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            TableModel model = listOfOrders.getModel();
            int rowCount = model.getRowCount();
            LocalDateTime now = LocalDateTime.now();
            
            
                for (int i = 0; i < rowCount; i++) {
                    int productId = Integer.parseInt(model.getValueAt(i, 0).toString());
                    int quantity = Integer.parseInt(model.getValueAt(i, 2).toString());
                    
                    pst.setLong(1, saleId);
                    pst.setInt(2, productId);
                    pst.setInt(3, quantity);
                    pst.addBatch();
                }
            
            
            pst.executeBatch();
           System.out.println("Sale successfully recorded!");

        } catch (SQLException e) {e.printStackTrace();}
}
    public void prepareSales(JComboBox productField, JComboBox cashierField){
        
        Connection conn = DBControllers.getConnection();
        
    try {
        String query = "SELECT product_id, product_name, product_price FROM products";
        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        productField.removeAllItems();
        productField.addItem(null); //placeholder

        while (rs.next()) {
            int id = rs.getInt("product_id");
            String name = rs.getString("product_name");
            double price = rs.getDouble("product_price");
            productField.addItem(new ProductModel(id, name, price));
        }

        rs.close();
        pst.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }    
    
    try {
        String query = "SELECT employee_id, fname, lname, role FROM employees ORDER BY fname ASC";
        PreparedStatement pst = conn.prepareStatement(query);
        ResultSet rs = pst.executeQuery();

        cashierField.removeAllItems();
        cashierField.addItem(null); // placeholder

        while (rs.next()) {
            int id = rs.getInt("employee_id");
            String fname = rs.getString("fname");
            String lname = rs.getString("lname");
            int role = rs.getInt("role");

            cashierField.addItem(new EmployeeModel(id, fname, lname, role, null, null));
        }

        rs.close();
        pst.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    }
    
    public void filterSales(JTable salesReport, JTextField orderIDField, JTextField fromField, JTextField toField, JComboBox cashierField, JComboBox productField){
        Connection conn = DBControllers.getConnection();
        DefaultTableModel model = new DefaultTableModel(new Object[]{"Order ID", "Product Name", "Quantity", "Total Price", "Date"}, 0);
        
        String baseQuery = 
        "SELECT s.sale_id, p.product_name, si.quantity, " +
        "       (si.quantity * p.product_price) AS total_price, s.date " +
        "FROM sales s " +
        "JOIN sales_items si ON s.sale_id = si.sale_id " +
        "JOIN products p ON si.product_id = p.product_id " +
        "JOIN employees e ON s.cashier_id = e.employee_id " +
        "WHERE 1=1 ";

        List<Object> params = new ArrayList<>();

    // Order ID filter
        String orderIdText = orderIDField.getText().trim();
        if (!orderIdText.isEmpty()) {
           baseQuery += "AND s.sale_id = ? ";
            params.add(Long.parseLong(orderIdText));
        }

    // Date Range filter
        String dateFrom = fromField.getText().trim();
        String dateTo = toField.getText().trim();
        if (!dateFrom.isEmpty() && !dateTo.isEmpty()) {
            baseQuery += "AND s.date BETWEEN ? AND ? ";
            params.add(Timestamp.valueOf(dateFrom + " 00:00:00"));
           params.add(Timestamp.valueOf(dateTo + " 23:59:59"));
        }

    // Cashier filter
        EmployeeModel cashier = (EmployeeModel) cashierField.getSelectedItem();
        if (cashier != null) {
            baseQuery += "AND s.cashier_id = ? ";
            params.add(cashier.getEmployee_id());
        }
        
    // Product filter
        ProductModel product = (ProductModel) productField.getSelectedItem();
        if (product != null) {
            baseQuery += "AND p.product_id = ? ";
            params.add(product.getProduct_id());
        }
        
        // Sorting
        baseQuery += "ORDER BY s.sale_id ASC, s.date ASC";

        try {
            PreparedStatement pst = conn.prepareStatement(baseQuery);

            for (int i = 0; i < params.size(); i++) {
                pst.setObject(i + 1, params.get(i));
            }

        ResultSet rs = pst.executeQuery();
        model.setRowCount(0);

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getLong("sale_id"),
                    rs.getString("product_name"),
                    rs.getInt("quantity"),
                    rs.getDouble("total_price"),
                    rs.getTimestamp("date")
                });
            }

            salesReport.setModel(model);
            rs.close();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error loading filtered data: " + e.getMessage());
        }
    }
    
    public void addEmployee(JTextField empIDfield, JTextField fnamefield, JTextField lnamefield, JComboBox<String> PositionBox, JTextField usernamefield, JTextField passwordfield, JTable EmployeeTable) {
        Connection conn = DBControllers.getConnection();

        int empId = Integer.parseInt(empIDfield.getText().trim());
        String fname = fnamefield.getText().trim();
        String lname = lnamefield.getText().trim();
        String roleName = PositionBox.getSelectedItem().toString();
        String username = usernamefield.getText().trim();
        String password = passwordfield.getText().trim();

        if (fname.isEmpty() || lname.isEmpty() || username.isEmpty() || password.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please fill in all fields!");
            return;
        }

        try {
            // Check if employee already exists
            PreparedStatement checkEmp = conn.prepareStatement("SELECT employee_id FROM employees WHERE employee_id = ?");
            checkEmp.setInt(1, empId);
            ResultSet rs = checkEmp.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Employee ID already exists!");
                return;
            }

            // Get role_id from role_name
            PreparedStatement roleStmt = conn.prepareStatement("SELECT role_id FROM roles WHERE role_name = ?");
            roleStmt.setString(1, roleName.toLowerCase());
            ResultSet roleRs = roleStmt.executeQuery();
            int roleId = 0;
            if (roleRs.next()) roleId = roleRs.getInt("role_id");

            // Insert employee
            PreparedStatement insertEmp = conn.prepareStatement("INSERT INTO employees (employee_id, fname, lname, role) VALUES (?, ?, ?, ?)");
            insertEmp.setInt(1, empId);
            insertEmp.setString(2, fname);
            insertEmp.setString(3, lname);
            insertEmp.setInt(4, roleId);
            insertEmp.executeUpdate();

            // Insert account
            PreparedStatement insertAcc = conn.prepareStatement("INSERT INTO accounts (employee_id, username, password) VALUES (?, ?, ?)");
            insertAcc.setInt(1, empId);
            insertAcc.setString(2, username);
            insertAcc.setString(3, password);
            insertAcc.executeUpdate();

            JOptionPane.showMessageDialog(null, "Employee added successfully!");
            loadTableDataEmp(EmployeeTable);

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error adding employee!");
        }
    }   
    
    public void updateEmployee(JTextField empIDfield, JTextField fnamefield, JTextField lnamefield, JComboBox<String> PositionBox, JTextField usernamefield, JTextField passwordfield, JTable EmployeeTable) {
        Connection conn = DBControllers.getConnection();

        int empId = Integer.parseInt(empIDfield.getText().trim());
        String fname = fnamefield.getText().trim();
        String lname = lnamefield.getText().trim();
        String roleName = PositionBox.getSelectedItem().toString();
        String username = usernamefield.getText().trim();
        String password = passwordfield.getText().trim();

        try {
            PreparedStatement roleStmt = conn.prepareStatement("SELECT role_id FROM roles WHERE role_name = ?");
            roleStmt.setString(1, roleName.toLowerCase());
            ResultSet roleRs = roleStmt.executeQuery();
            int roleId = 0;
            if (roleRs.next()) roleId = roleRs.getInt("role_id");

            // Update employees table
            PreparedStatement updateEmp = conn.prepareStatement("UPDATE employees SET fname=?, lname=?, role=? WHERE employee_id=?");
            updateEmp.setString(1, fname);
            updateEmp.setString(2, lname);
            updateEmp.setInt(3, roleId);
            updateEmp.setInt(4, empId);
            updateEmp.executeUpdate();

            // Update accounts table
            PreparedStatement updateAcc = conn.prepareStatement("UPDATE accounts SET username=?, password=? WHERE employee_id=?");
            updateAcc.setString(1, username);
            updateAcc.setString(2, password);
            updateAcc.setInt(3, empId);
            updateAcc.executeUpdate();

            JOptionPane.showMessageDialog(null, "Employee updated successfully!");
            loadTableDataEmp(EmployeeTable);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error updating employee!");
        }
    }
    
    public void deleteEmployee(JTable EmployeeTable) {
        int selectedRow = EmployeeTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select an employee to delete!");
            return;
        }

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete this employee?", "Confirm Deletion", JOptionPane.YES_NO_OPTION);
        if (confirm != JOptionPane.YES_OPTION) return;

        int empId = Integer.parseInt(EmployeeTable.getValueAt(selectedRow, 0).toString());
        Connection conn = DBControllers.getConnection();

        try {
            // Delete from accounts first (foreign key constraint)
            PreparedStatement delAcc = conn.prepareStatement("DELETE FROM accounts WHERE employee_id=?");
            delAcc.setInt(1, empId);
            delAcc.executeUpdate();

            // Then delete from employees
            PreparedStatement delEmp = conn.prepareStatement("DELETE FROM employees WHERE employee_id=?");
            delEmp.setInt(1, empId);
            delEmp.executeUpdate();

            JOptionPane.showMessageDialog(null, "Employee deleted successfully!");
            loadTableDataEmp(EmployeeTable);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error deleting employee!");
        }
    }
    
    public void searchEmployee(JTable tableName, String searchText) {
        Connection conn = DBControllers.getConnection();
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Employee I.D.", "First Name", "Last Name", "Role", "Username", "Password"});

        String sql = """
            SELECT 
                e.employee_id, e.fname, e.lname, r.role_name, a.username, a.password
            FROM employees e
            JOIN roles r ON e.role = r.role_id
            JOIN accounts a ON e.employee_id = a.employee_id
        """;

        // Only filter by first or last name
        if (searchText != null && !searchText.trim().isEmpty()) {
            sql += " WHERE e.fname LIKE ? OR e.lname LIKE ? ";
        }

        sql += " ORDER BY e.employee_id ASC";

        try (PreparedStatement pst = conn.prepareStatement(sql)) {
            if (searchText != null && !searchText.trim().isEmpty()) {
                String keyword = "%" + searchText + "%";
                pst.setString(1, keyword);
                pst.setString(2, keyword);
            }

            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getInt("employee_id"),
                    rs.getString("fname"),
                    rs.getString("lname"),
                    rs.getString("role_name"),
                    rs.getString("username"),
                    rs.getString("password")
                });
            }

            tableName.setModel(model);
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error searching employee data!");
        }
    }

}
