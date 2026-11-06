import java.util.*;
import java.io.Serializable;

abstract class User implements HasMenu, Serializable {
    String userName;
    String PIN;


    boolean login() {
        Scanner scanner = new Scanner(System.in);
        String userNameInput;
        String PINInput;
        
        System.out.println("Enter username:");
        userNameInput = scanner.nextLine();
        System.out.println("Enter PIN:");
        PINInput = scanner.nextLine();
        return login(userNameInput, PINInput);
    }
    boolean login(String userName, String PIN) {
        boolean tf = false;
        if (userName == this.userName && PIN == this.PIN) {
            tf = true;
        } else {
            System.out.println("Invalid login credentials");
        }
        return tf;
    }
    void setUserName(String userName) {
        this.userName = userName;
    }
    String getUserName() {
        return userName;
    }
    void setPIN(String PIN) {
        this.PIN = PIN;
    }
    String getPIN() {
        return PIN;
    }
    abstract String getReport();
}