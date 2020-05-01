package Udemy.CodingExercisesSec4;

public class SectionFourChallenges {
    private static final String INVALID_VALUE_MESSAGE = "Invalid Value";

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + "km/h = " + milesPerHour + " mi/h");
        }
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        if (kiloBytes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
        } else if (kiloBytes >= 0) {
            int megaBytes = Math.round(kiloBytes / 1024);
            int remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + " KB = " + megaBytes + " MB and " + remainingKiloBytes + " KB");
        }
    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (barking && ((hourOfDay >= 0 && hourOfDay < 8) || (hourOfDay > 22 && hourOfDay < 24))) {
            System.out.println("Dog barking, need to wake up");
            return true;
        }
        System.out.println("Dog barking, no need to wake up");
        return false;
    }

    public static boolean isLeapYear(int year) {
        boolean x = (year >= 1 && year <= 9999);
        if (!x) {
            System.out.println("Invalid Year");
            return false;
        } else {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    if (year % 400 == 0) {
                        System.out.println("Leap Year");
                        return true;
                    } else {
                        System.out.println("Not a leap year");
                        return false;
                    }
                } else {
                    System.out.println("Leap year");
                    return true;
                }
            } else {
                System.out.println("Not leap year");
                return false;
            }
        }
    }

    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((int) (num1 * 1000) == (int) (num2 * 1000)) {
            System.out.println("This Number is equal to 3 decimal number");
            return true;
        } else {
            System.out.println("This Number is not equal to 3 decimal number");
            return false;
        }
    }

    public static boolean hasEqualSum(int num1, int num2, int num3) {
        if (num1 + num2 == num3) {
            System.out.println("The first 2 numbers does equal to 3rd number");
            return true;
        } else {
            System.out.println("The first 2 numbers does not equal to 3rd number");
            return false;
        }
    }

    public static boolean hasTeen(int num1, int num2, int num3) {
        if ((num1 >= 13 && num1 <= 19) || (num2 >= 13 && num2 <= 19) || (num3 >= 13 && num3 <= 19)) {
            System.out.println("This person has a teen");
            return true;
        }
        System.out.println("This person hasn't got a teen");
        return false;
    }

    public static boolean isTeen(int num1) {
        if (num1 >= 13 && num1 <= 19) {
            System.out.println("This person is a teen");
            return true;
        }
        System.out.println("This person is not a teen");
        return false;
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches) {
        if ((feet < 0) || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches) {
        if (inches < 0) {
            System.out.println("Invalid inches");
            return -1;
        }
        double feet = (int) inches * 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimeters(feet, remainingInches);
    }

    public static String getDurationString(long minutes, long seconds) {
        if ((minutes >= 0) && (seconds >= 0 && seconds <= 59)) {

            long hours = minutes / 60;
            long remainingMinutes = minutes % 60;

            String hoursString = hours + "h";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            System.out.println(hoursString + " " + minutesString + " " + secondsString);
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static String getDurationString(long seconds) {
        if ((seconds >= 0)) {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
        }
        return INVALID_VALUE_MESSAGE;
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        } else {
            return radius * radius * Math.PI;
        }
    }

    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        } else {
            return x * y;
        }
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }
        long days = minutes / 1440;
        long years = days / 365;
        days %= 365;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }

    public static void printEqual(int a, int b, int c) {
        if ((a < 0) || (b < 0) || (c < 0)) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return;
        }
        if ((a == b) && (b == c)) {
            System.out.println("All numbers are equal");
        } else if ((a != b) && (b != c) && (a != c)) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        if (summer) {
            return (temperature >= 25) && (temperature <= 45);
        } else {
            return (temperature >= 25) && (temperature <= 35);
        }
    }

    public static void switchStatement(char characterTest) {
        String changeCharToString = Character.toString(characterTest).toUpperCase();
        switch (changeCharToString) {
            case "A":
            case "B":
            case "C":
            case "D":
            case "E":
                System.out.println("Value is " + changeCharToString);
                break;
            default:
                System.out.println(INVALID_VALUE_MESSAGE);
                break;
        }
    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Monday");
                break;
            case 1:
                System.out.println("Tuesday");
                break;
            case 2:
                System.out.println("Wednesday");
                break;
            case 3:
                System.out.println("Thursday");
                break;
            case 4:
                System.out.println("Friday");
                break;
            case 5:
                System.out.println("Saturday");
                break;
            case 6:
                System.out.println("Sunday");
                break;
            default:
                System.out.println(INVALID_VALUE_MESSAGE);
                break;
        }
    }

    public static void printDayOfTheWeekIf(int day) {
        if (day == 0) {
            System.out.println("Monday");
        } else if (day == 1) {
            System.out.println("Tuesday");
        } else if (day == 2) {
            System.out.println("Wednesday");
        } else if (day == 3) {
            System.out.println("Thursday");
        } else if (day == 4) {
            System.out.println("Friday");
        } else if (day == 5) {
            System.out.println("Saturday");
        } else if (day == 6) {
            System.out.println("Sunday");
        } else {
            System.out.println(INVALID_VALUE_MESSAGE);
        }
    }

    public static void printNumberInWord(int day) {
        switch (day) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println(INVALID_VALUE_MESSAGE);
                break;
        }
    }

    public static int getDaysInMonth(int month, int year) {
        if (year < 1 || year > 9999) {
            return -1;
        } else
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 2: {
                    if (isLeapYear(year)) return 29;
                    else
                        return 28;
                }
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return -1;
            }
    }

    public static double calculateInterestRate(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {

        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isOdd(int number) {
        if ((number % 2 != 0) && (number > 0)) {
            return true;
        }
        return false;
    }

    public static int sumOdd(int start, int end) {

        int sum = 0;
        if ((end < start) || (start < 0)) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;

            }
        }
        return sum;

    }

    public static boolean isEvenNumber(int number) {
        if ((number % 2) == 0) {
            //System.out.println("This number is an even number " + number);
            return true;
        }
        //System.out.println("This number is not even number " + number);
        return false;
    }

    public static void isEvenNumber() {

        int startNumber = 0;
        int finishNumber = 20;

        while (startNumber <= finishNumber) {
            startNumber++;
            if (!isEvenNumber(startNumber)) {
                continue;
            }
            System.out.println("This number is an even number " + startNumber); }
    }

    public static int sumDigits(int number){
        if(number<10){
            return -1;
        }
        int sum =0;
        while (number >0){
            int digit = number %10;
            sum += digit;

            number/=10;
        }
        return sum;
    }

}