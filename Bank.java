import java.util.*;

class Bank {
    Admin admin = new Admin();
    ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.start();
    }


    public Bank() {

    }
    public void loadCustomers() {

    }
    public void saveCustomers() {
        
    }
    public void fullCustomerReport() {

    }
    public void addUser() {
        String userNameInput;
        String PINInput;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username (at least 3 characters)");
        boolean validUserName = false;
        while (!validUserName) {
            userNameInput = Scanner.nextLine();

            if (useruserNameInput.length() < 3) {
                validUserName = true;

                for (Customer customer : customers) {
                    if (userNameInput.equals(customer.getUserName())) {
                        validUserName = false;
                        System.out.println("Username already in use");
                    }
                }
            } else {
                System.out.println("Invalid input");
            }
        }

        System.out.println("Enter PIN (4 numbers)");
        boolean validPIN = false;
        while (!validPIN) {
            PINInput = scanner.nextLine();
            try {
                Integer.parseInt(PINInput);

                if (PINInput.length() == 4) {
                    validPIN = true;
                } else {
                    System.out.println("Invalid input");
                }
            } catch (Exception e) {
                System.out.println("Invalid input");
            }
        }

        customers.add(new Customer(userNameInput, PINInput));
    }
    public void applyInterest() {

    }
    public void loginAsCustomer() {

    }
    public void menu() {

    }
    public void start() {

    }
    public void startAdmin() {

    }
}