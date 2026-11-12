# CS121-Project-9-Bank-On-It
# HasMenu.java
```
String menu()
void start()
```
# CheckingAccount.java
### public checkingAccount()
```
default instantionator. sets balance to 0.00
```
### public checkingAccount(double balance)
```
sets this.balance to balance
```
### public static void main(String[] args)
```
creating a new checking account called ca
use start() on ca
```
### public String menu()
```
returns the menu options as a string
```
### public void start()
```
create a scanner, an input, and a keepGoing variable

while keepGoing
    try
        use scanner to put next int into input
    catch
        input = -1
    
    if input == 0
        keepGoing = false
    elif input == 1
        checkBalance()
    elif input == 2
        makeDeposit()
    elif input == 3
        makeWithdrawal()
    else
        print "invalid input"
```
### public double getBalance()
```
returns balance
```
### public String getBalanceString()
```
turns balance into a string and returns it
```
### public void setBalance(double balance)
```
sets this.balance to balance
```
### public void checkBalance()
```
calls getBalanceString() and retuns the value
```
### public void makeDeposit()
```
create a a variable for input and a scanner

try
    use scanner to get next double and put in input
    if the input isn't less than or equal to 0, add the money
catch
    print "invalid input"
```
### public void makeWithdrawal()
```
create a a variable for input and a scanner

try
    use scanner to get next double and put in input
    if the input isn't less than or equal to 0, subtract the money
catch
    print "invalid input"
```
# SavingsAccount.java
### public static void main(String[] args)
```
create a new SavingsAccount and run start()
```
### public void calcInterest()
```
W.I.P.
```
### public void setInterestRate(double interestRate)
```
sets this.interestRate to interestRate
```
### public double getInterestRate()
```
returns interestRate
```
### public String menu()
```
returns menu options for SavingsAccount
```
# User.java
### boolean login()
```
create a scanner, a variable for userNameInput, and a variable for PINInput

prompt user for userName and PIN
calls the login() method with the parameters received from the user
```
### boolean login(String userName, String PIN)
```
create a boolean tf that starts as false
if username is correct and pin is correct
    tf = true
else
    print "invalid login credentials"
return tf
```
### void setUserName(String userName)
```
sets this.userName to userName
```
### String getUserName()
```
returns userName
```
### void setPIN(String PIN)
```
sets this.PIN to PIN
```
### String getPIN()
```
returns PIN
```
### abstract String getReport()
```
W.I.P.
```
# Customer.java
###  public static void main(String[] args)
```
create a new Customer and run the start() method
```
### public void start()
```
create CheckingAccount called checking and a SavingsAccount called savings
create a scanner, an input, and a keepGoing variable

while keepGoing
    if login() == true
        keepGoing = false

keepGoing = true
while keepGoing
    try
        use scanner to put next int into input
    catch
        input = -1
    
    if input == 0
        keepGoing = false
    elif input == 1
        checkBalance()
    elif input == 2
        makeDeposit()
    elif input == 3
        makeWithdrawal()
    else
        print "invalid input"
```
### public String menu()
```
returns the menu options as a string
```
### public Customer()
```
default constructor
```
### public Customer(String userName, String PIN) 
```
sets this.userName to userName
sets this.PIN to PIN
```
### public void changePin()
```
create a scanner, a pinInputInt, and a pinInputStr variable

prompt user for new pin and store in pinInputStr

try
    convert pinInputStr to an int and put it in pinInputInt
    if pin length is 4, set pin to new pin. else, print "invalid input"
catch
    print "invalid input"
```
### public String getReport()
```
W.I.P.
```



# Saving and loading customers
```
addUser() will go through the process of creating a new Customer
    have userNameInput and PINInput variables for making the object
    get inputs for those variables
    create new customer object with those variables
    add to the end of the customers ArrayList
saveCustomers() will take customers and put it in customerArray.dat
loadCustomers() will load all of the customers from the customer file and put them in the customers ArrayList
    
```
# Logging in as customer
```
call loginAsCustomer()

```