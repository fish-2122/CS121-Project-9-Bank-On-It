import java.util.*;

public class SavingsAccount extends CheckingAccount {
    double interestRate = 0.00;


    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.start();
    }

    public void calcInterest() {
        System.out.println("WIP");
    }
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }
    public String menu() {
        String returnString = "Savings account menu\n0) Quit\n1) Check balance\n2) Make a deposit\n3) Make a withdrawal\nInput: ";
        return returnString;
    }
}