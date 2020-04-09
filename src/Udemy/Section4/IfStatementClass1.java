package Udemy.Section4;

public class IfStatementClass1 {

    public static void main(String[] args) {

        // 2 different score, see class 2 for better method created a method

        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        if (gameOver) {
            int finalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}