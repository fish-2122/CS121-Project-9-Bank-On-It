import java.util.*;
import java.io.Serializable;

class Customer extends User implements Serializable {
    CheckingAccount checking = new CheckingAccount();
    SavingsAccount savings = new SavingsAccount();


    public static void main(String[] args) {
        Customer customer = new Customer("Alice", "1111");
        
        boolean keepGoing = true;
        while (keepGoing) {
            if (customer.login()) {
                keepGoing = false;
                customer.start();
            }
        }
    }


    public void start() {
        Scanner scanner = new Scanner(System.in);
        int input = -1;

        boolean keepGoing = true;
        while (keepGoing) {
            System.out.println(menu());

            try {
                input = scanner.nextInt();
            } catch (Exception e) {
                input = -1;
            }

            if (input == 0) {
                keepGoing = false;
            } else if (input == 1) {
                checking.start();
            } else if (input == 2) {
                savings.start();
            } else if (input == 3) {
                changePin();
            } else {
                System.out.println("Invalid input");
            }
        }
    }
    public String menu() {
        String returnString = "Customer menu\n0) Quit\n1) Manage checking account\n2) Managing savings account\n3) Change PIN\nInput: ";
        return returnString;
    }
    

    public Customer() {
        userName = "Alice";
        PIN = "1111";
    }
    public Customer(String userName, String PIN) {
        this.userName = userName;
        this.PIN = PIN;
    }
    
    public void changePin() {
        Scanner scanner = new Scanner(System.in);
        int PINInputInt;
        String PINInputStr;

        System.out.println("Enter a new PIN (4 numbers)");
        PINInputStr = scanner.nextLine();

        try {
                PINInputInt = Integer.parseInt(PINInputStr);

                if (PINInputStr.length() == 4) {
                    setPIN(PINInputStr);
                } else {
                    System.out.println("Invalid input");
                }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
    public String getReport() {
        String returnString = "User: " + userName + ", Checking: " + checking.getBalanceString() + ", Savings: " + savings.getBalanceString();
        return returnString;
    }
}