
package posClasses;

public class EmployeeModel {
    private int employee_id;
    private String fname, lname;
    private int role;
    private String username, password;
    
    public EmployeeModel(int employee_id, String fname, String lname, int role, String username, String password) {
        this.employee_id = employee_id;
        this.fname = fname;
        this.lname = lname;
        this.role = role;
        this.username = username;
        this.password = password;
    }
    
    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public String toString() {
        return fname + " " + lname;
    }
    
    
}
