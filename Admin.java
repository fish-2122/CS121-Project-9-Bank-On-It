import java.util.*;

class Admin extends User{
    public Admin() {
        userName = "admin";
        PIN = "0000";
    }
    public String menu() {
        String returnString = "Admin menu\n0) Quit\n1) Full customer report\n2) Add user\n3) Apply interest to savings accounts";
        return returnString;
    }
    public String getReport() {
        String returnString = "Admin name: " + userName + "\nPIN: " + PIN;
        return returnString;
    }
    void start() {
        System.out.println("W.I.P.");
    }
}