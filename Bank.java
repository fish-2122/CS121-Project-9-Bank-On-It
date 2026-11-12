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
        try {
            FileInputStream fIn = new FileInputStream("customerArray.dat");
            ObjectInputStream obIn = new ObjectInputStream(fIn);
            customers = (Customer[])obIn.readObject();
            System.out.println(critters[0].name);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
    public void saveCustomers() {
        try {
            FileOutputStream fo = new FileOutputStream("customerArray.dat");
            ObjectOutputStream obOut = new ObjectOutputStream(fo);
            obOut.writeObject(customers);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
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
        String userNameInput;
        String PINInput;
        System.out.println("Enter username:");
        userNameInput = scanner.nextLine();
        System.out.println("Enter PIN:");
        PINInput = scanner.nextLine();

        Customer loggedInCustomer;
        for (Customer customer : customers) {
            if (userNameInput.equals(customer.getUserName())) {
                loggedInCustomer = customer;
            } else {
                System.out.println("No account found");
            }
        }
        
        if (loggedInCustomer.login(userNameInput, PINInput)) {
            loggedInCustomer.start();
            saveCustomers();
        } else {
            System.out.println();
        }
    }
    public String menu() {
        String returnString = "0) Quit\n1) Login as admin\n2) Login as customer";
        return returnString;
    }
    public void start() {
        loadCustomers();

        Scanner scanner = new Scanner(System.in);

        boolean keepGoing = true
        while keepGoing () {
            menu();
            String userInput = -1;

            If (userInput == 0) {
                keepGoing = false;
            } else if (userInput == 1) {
                
            } else if (userInput == 2) {
                loginAsCustomer();
            } else {
                System.out.println("Invalid input");
            }
        }
    }
    public void startAdmin() {

    }
}