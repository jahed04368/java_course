package Udemy.Section6OOPS;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this(12345678,20,"Jahed", "test@gmail.com", "079845415556");
        System.out.println("A constructor with this calling the other constructor with relevant parameters");
    }
    public BankAccount(int accountNumber, double balance, String customerName, String email, String phoneNumber){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.customerName=customerName;
        this.email=email;
        this.phoneNumber=phoneNumber;
    }

    public BankAccount(String customerName, String email, String phoneNumber){
        this(1234,10,customerName,email,phoneNumber);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(int balance) { this.balance = balance; }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double moneyDeposit) {
        if (moneyDeposit>0){
            this.balance += moneyDeposit;
            System.out.println("your new balance is " + this.balance+" after depositing " + moneyDeposit);
        }else {
            System.out.println("Please deposit at least more than 1p");
        }
    }

    public void withdrawFunds(int withdrawMoney) {
        if (this.balance < 0) {
            System.out.println("your balance is = "+ this.balance);
        } else if (withdrawMoney > this.balance) {
            System.out.println("you are trying to take out more money than you have" +
                    " you have "+ this.balance + " and you're trying to withdraw  "+ withdrawMoney);
        }
        System.out.println("Balance before withdrawing = "+ this.balance);
        this.balance -= withdrawMoney;
        System.out.println("withdraw = "+ withdrawMoney + " funds left on Account "+ this.balance);
    }
}
