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
