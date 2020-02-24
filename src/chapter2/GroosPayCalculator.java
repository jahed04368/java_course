package chapter2;

import org.omg.CORBA.PUBLIC_MEMBER;
import sun.applet.Main;

import java.util.Scanner;

public class GroosPayCalculator {

    public static void main(String arg[]) {

        System.out.println("Enter the number of hours the employee worked.");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        System.out.println("Enter the employee's pay rate.");
        double rate = scanner.nextDouble();

        double grossPay = hours * rate;

        System.out.println("This is your gross pay: £" + grossPay);

    }
}
