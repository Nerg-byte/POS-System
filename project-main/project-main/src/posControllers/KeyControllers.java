
package posControllers;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import posClasses.Session;
import posControllers.DBMethods;
import static posMenus.CashierPanel.previousTabIndex;
import posControllers.mainFrame;


public class KeyControllers {
    
    public static void ShowOnDisplay(String oldString, String a, JTextField TextField){
        String newString = oldString.concat(a);
        TextField.setText(newString);
    }
    
    /**
     *
     * @param listOfOrders
     * @param totalPrice
     * @param cashPayment
     * @param Change
     * @param Receipt
     * @param cashierId
     */
    public static void PrintReceipt(JTable listOfOrders, JLabel totalPrice, JTextField cashPayment, JLabel Change, JTextArea Receipt, Session sesh){
        DefaultTableModel dt = (DefaultTableModel) listOfOrders.getModel();
        Receipt.setText("");
        Long sale_id = System.currentTimeMillis(); 
        
        String Str = String.valueOf(sale_id); String trunc = Str.substring(5); sale_id = Long.parseLong(trunc);
        
        Timestamp now = Timestamp.valueOf(LocalDateTime.now());
        

        Receipt.append("POS SYSTEM RECEIPT\n");
        Receipt.append("Order ID: " + sale_id + "\n");
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Receipt.append("Date and Time: " + now + "\n");
        Receipt.append("--------------------------------------\n");
        Receipt.append(String.format("%-5s %-15s %-8s %-10s\n", "ID", "Item", "Qty", "Total"));
        Receipt.append("--------------------------------------\n");
        for (int i = 0; i < dt.getRowCount(); i++) {
            int id = (int) dt.getValueAt(i, 0);
            String item = (String) dt.getValueAt(i, 1);
            int qty = (int) dt.getValueAt(i, 2);
            double total = Double.parseDouble(dt.getValueAt(i, 3).toString());

            Receipt.append(String.format("%-5d %-15s %-8d %-10.2f\n", id, item, qty, total));
        }
        
        Receipt.append("-------------------------------------\n");
        //PrintReceipt(JTable listOfOrders, JLabel totalPrice, JTextField cashPayment, JLabel Change)
        // Add total, cash, and change (if you have them)
        Receipt.append("TOTAL: " + totalPrice.getText() + "\n");
        Receipt.append("CASH: " + cashPayment.getText() + "\n");
        Receipt.append("CHANGE: " + Change.getText() + "\n");
        Receipt.append("==================================\n");
        Receipt.append("    THANK YOU SA PAGBILI!!    \n");
        
        DBMethods db = new DBMethods();
        
        db.insertSaletoDatabase(listOfOrders, sale_id , sesh.GetCashierId(), now);
        
    }
    
    public static void addtable(int id, String item, int quantity, double price, JTable listOfOrders, JLabel totalPrice){
    
        DefaultTableModel dt = (DefaultTableModel) listOfOrders.getModel();
        boolean multi = false;
        
        for(int i = 0; i < dt.getRowCount(); i++){
            String tableItem = dt.getValueAt(i, 1).toString();
            
            if (tableItem.equals(item)){
            int oldQuantity = Integer.parseInt(dt.getValueAt(i, 2).toString());
            int newQuantity = oldQuantity + 1;
            double newTotal = price * newQuantity;
            
            dt.setValueAt(newQuantity, i, 2);
            dt.setValueAt(newTotal, i, 3);
            multi = true;
            break;
            }
        }
        
        if(!multi){
            double total = price * quantity;
            Object[] rowOrder = {id,item,quantity,total};
            dt.addRow(rowOrder);
        }
    updateTotal(listOfOrders, totalPrice);    
    }
    
    public static void updateTotal(JTable listOfOrders, JLabel totalPrice){
        DefaultTableModel dt = (DefaultTableModel) listOfOrders.getModel();
        double total = 0;
    
        for(int i = 0; i < dt.getRowCount(); i++){
            total += Double.parseDouble(dt.getValueAt(i, 3).toString());
        }
    
    totalPrice.setText(String.valueOf(total));
    }
    
    public static void AddToQntty(JLabel menuQntty){
        int m2qnty = Integer.parseInt(menuQntty.getText());
        m2qnty++;
        menuQntty.setText(String.valueOf(m2qnty));
    }
    
    public static void ClearInput(JTextField cashPayment){
        cashPayment.setText("");
    }
    
    public static void Delete(JTextField cashPayment){
        String text = cashPayment.getText();
        if (!text.isEmpty()) {
            cashPayment.setText(text.substring(0, text.length() - 1));
        }
    }
    
    public static void CountItems(JTable listOfOrders,JLabel display){
        display.setText(String.valueOf(listOfOrders.getSize()));
    }
    
    public static void CheckForPermissions(JTabbedPane TabbedPane, mainFrame parent, Session sesh){
        int selectedIndex = TabbedPane.getSelectedIndex();
        int role = sesh.GetCurrentRole();
        
        boolean allowed = switch (selectedIndex) {
                case 0 -> true;                  // Everyone can access Cashier Panel
                case 1 -> (role == 1);           // Admin only on Employees
                case 2 -> (role == 1 || role == 2); // Admin + Manager on Sales report
                default -> true;
                };
        
        try {
            if (!allowed ) {
                // Revert to the previous tab
                TabbedPane.setSelectedIndex(previousTabIndex);
                
                JOptionPane.showMessageDialog(parent,
                        "Access denied! You are not authorized to view this tab.",
                        "Permission Denied",
                        JOptionPane.WARNING_MESSAGE);
            } else {
                previousTabIndex = selectedIndex;
            }
        } catch (NullPointerException e) {
            System.out.println("may mali");
        }
    }
    
    public static void Logout(mainFrame parent, JPanel panel, Session sesh){
        int confirm = javax.swing.JOptionPane.showConfirmDialog(
            panel,
            "Are you sure you want to log out?",
            "Logout",
            javax.swing.JOptionPane.YES_NO_OPTION
        );

        if (confirm == javax.swing.JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(parent, "Successfully Logged Out");
            sesh.SetCashierId(0); sesh.SetCurrentUser(null); sesh.SetCurrentRole(0);
            parent.showPage("LoginPanel");
        }
    }
}

