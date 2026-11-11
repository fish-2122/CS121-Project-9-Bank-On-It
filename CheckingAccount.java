import java.util.*;
import java.io.Serializable;

class CheckingAccount implements HasMenu, Serializable {
    double balance;

    
    public CheckingAccount() {
        balance = 0.00;
    }
    public CheckingAccount(double balance) {
        this.balance = balance;
    }
    public static void main(String[] args) {
        CheckingAccount ca = new CheckingAccount(100.00);
        ca.start();
    }


    public String menu() {
        String returnString = "Checking account menu\n0) Quit\n1) Check balance\n2) Make a deposit\n3) Make a withdrawal\nInput: ";
        return returnString;
    }
    public void start() {
        Scanner scanner = new Scanner(System.in);
        int input;
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
                checkBalance();
            } else if (input == 2) {
                makeDeposit();
            } else if (input == 3) {
                makeWithdrawal();
            } else {
                System.out.println("Invalid input");
            }

        }
    } 


    public double getBalance() {
        return balance;
    }
    public String getBalanceString() {
        return Double.toString(balance);
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void checkBalance() {
        System.out.println("Current balance: " + getBalanceString());
    }
    private double getDouble() {
        return 0.00;
    }
    public void makeDeposit() {
        double input = 0.00;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input: ");
            input = scanner.nextDouble();
            if (input <= 0.00) {
                System.out.println("Invalid input");
            } else {
                balance += input;
                System.out.println("New balance: " + getBalanceString());
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
    public void makeWithdrawal() {
        double input = 0.00;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Input: ");
            input = scanner.nextDouble();
            if (input <= 0.00) {
                System.out.println("Invalid input");
            } else {
                balance -= input;
                System.out.println("New balance: " + getBalanceString());
            }
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }
}
