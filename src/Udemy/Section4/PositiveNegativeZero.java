package Udemy.Section4;

public class PositiveNegativeZero {

    public static void main(String[] args) {
        checkNumber(0);
    }

    public static void checkNumber(int number) {
        String text = null;
        if (number > 0) {
            text = "positive";
        } else if (number < 0) {
            text = "negative";
        } else if (number == 0){
            text = "zero";
        }
        System.out.println(text);
    }
}
