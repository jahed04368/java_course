package Udemy.CodingExercisesSec4;

import java.util.Enumeration;
import java.util.Scanner;

public class SectionFiveChallenges {
    public static boolean isPalindrome(int number) {

        int lastDigit, reverse = 0;
        int oldNumber = number;

        while (number != 0) {
            lastDigit = number % 10;
            reverse = reverse * 10 + lastDigit;
            number /= 10;
        }
        if (reverse == oldNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int lastDigit = number % 10;

        while (number >= 10) {
            number /= 10;
            System.out.println(number);
        }
        int firstDigit = number;
        return firstDigit + lastDigit;
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        } else {
            int sum = 0;
            while (number != 0) {
                if (((number % 10) % 2) == 0) {
                    sum += number % 10;
                }
                number /= 10;

            }
            return sum;
        }
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x < 10) || (x > 99) || (y < 10) || (y > 99)) {
            return false;
        }
        int first = x;
        for (int i = 0; i < 2; i++) {
            int lastDigFirst = first % 10;
            int second = y;
            for (int j = 0; j < 2; j++) {
                int lastDigSecond = second % 10;
                if (lastDigFirst == lastDigSecond) {
                    return true;
                }

                second /= 10;
            }
            first /= 10;
        }

        return false;

    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if ((bigCount < 0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }
        if (bigCount * 5 + smallCount >= goal) {
            if (bigCount * 5 == goal || smallCount >= goal || goal >= 5 && bigCount > 1 && smallCount >= goal % 5) {
                return true;
            }
        }
        return false;
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }

        int largestPrime = 2;
        while (number != 1) {
            if (number % largestPrime == 0) {
                number = number / largestPrime;
            } else {
                largestPrime++;
            }
        }
        return largestPrime;
    }

//    public static int printSquareStar(int number) {
//        if (number < 5) {
//            System.out.println("Invalid Value");
//        }
//
//    }

        public static void scannerMethod() {
            Scanner scanner = new Scanner(System.in);
            boolean hasNextInt = scanner.hasNextInt();
    }
}

