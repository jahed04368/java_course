package Udemy.CodingExercisesSec4;

public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
        } else if (kiloBytes >= 0) {
            int megaBytes = Math.round(kiloBytes / 1024);
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay<8||hourOfDay>22){
            System.out.println("true");
            return barking = true;
        } else if (hourOfDay<0||hourOfDay>23){
            System.out.println("false");
            return barking = false;
        }else {
            System.out.println("false");
            return barking = false;
        }
    }
}
