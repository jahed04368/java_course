package Udemy.Section6OOPS.Composition;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("230B", "Dell", "240", dimensions);
        //another way to create a class like above
        Monitor theMonitor = new Monitor("27inch Beast", "Dell", 27, new Resolution(250, 1440));
        Motherboard theMotherboard = new Motherboard("BJ-279", "Dell", 4, 6, "v2.44");
        PC thePC = new PC(theCase, theMonitor, theMotherboard);
        thePC.powerUp();

        //System.out.println(thePC);
    }


}
