package chapter2;

import java.util.Scanner;

public class MadLibs {

    public static void main(String arg[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a adjective.");
        String adjective = scanner.next();

        System.out.println("Enter a season of the year.");
        String season = scanner.next();


        System.out.println("Enter a whole number");
        int wholeNumber = scanner.nextInt();

        System.out.println("On a "+adjective+" "+season+" day, I drink a minimum of "+wholeNumber+" cups of coffee.");


//        System.out.println("Enter the number of hours the employee worked.");
//        Scanner scanner = new Scanner(System.in);
//        int hours = scanner.nextInt();
//
//        System.out.println("Enter the employee's pay rate.");
//        double rate = scanner.nextDouble();
//
//        double grossPay = hours * rate;


    }
}
