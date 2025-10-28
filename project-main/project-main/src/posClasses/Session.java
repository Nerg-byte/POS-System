
package posClasses;


public class Session {

    private int cashierId;
    private String current_user;
    private int current_role;

    public void SetCurrentUser(String user) {
        this.current_user = user;
    }

    public String GetCurrentUser() {
        return current_user;
    }

    public int GetCurrentRole() {
        return current_role;
    }

    public void SetCurrentRole(int a) {
        this.current_role = a;
    }

    public void SetCashierId(int id) {
        this.cashierId = id;
    }

    public int GetCashierId() {
        return cashierId;
    }
    
}
