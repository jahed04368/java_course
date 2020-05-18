package Udemy.Section6OOPS;

public class VipCustomer {

    private String customerName;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Jahed", 50, "test@gmail.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this(customerName, creditLimit, "jahed@gmail.com");
    }
    public VipCustomer(String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
