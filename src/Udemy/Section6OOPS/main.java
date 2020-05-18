package Udemy.Section6OOPS;

public class main {

    public static void main(String[] args) {
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= "+ calculator.getAdditionResult());
//        System.out.println("subtract= "+calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= "+calculator.getMultiplicationResult());
//        System.out.println("divide= "+ calculator.getDivisionResult());


//        Person person = new Person();
//        person.setFirstName("");
//        person.setLastName("");
//        person.setAge(10);
//        System.out.println("fullName= "+ person.getFullName());
//        System.out.println("teen= "+person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("fullName= "+person.getFullName());
//        System.out.println("teen= "+ person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullName= "+person.getFullName());

//        BankAccount bankAccount = new BankAccount();
////        bankAccount.setAccountNumber(12345678);
////        bankAccount.setBalance(20);
////        bankAccount.setCustomerName("Jahed");
////        bankAccount.setEmail("test@gmail.com");
////        bankAccount.setPhoneNumber("07984541557");
//        System.out.println("Account number= "+ bankAccount.getAccountNumber());
//        System.out.println("Account Balance= "+ bankAccount.getBalance());
//        System.out.println("Customer Name= "+ bankAccount.getCustomerName());
//        System.out.println("Customer Email= "+ bankAccount.getEmail());
//        System.out.println("Customer Phone Number= "+ bankAccount.getPhoneNumber());
//        bankAccount.depositFunds(1);
//        bankAccount.withdrawFunds(10);

        VipCustomer vipCustomer1 = new VipCustomer();
        System.out.println(vipCustomer1.getCustomerName());
        System.out.println(vipCustomer1.getCreditLimit());
        System.out.println(vipCustomer1.getEmailAddress());
        VipCustomer vipCustomer2 = new VipCustomer("joHN",30);
        System.out.println(vipCustomer2.getCustomerName());
        System.out.println(vipCustomer2.getCreditLimit());
        System.out.println(vipCustomer2.getEmailAddress());
        VipCustomer vipCustomer3 = new VipCustomer("Bob",30, "jAHED@GMAIL.COM");
        System.out.println(vipCustomer3.getCustomerName());
        System.out.println(vipCustomer3.getCreditLimit());
        System.out.println(vipCustomer3.getEmailAddress());

    }
}
