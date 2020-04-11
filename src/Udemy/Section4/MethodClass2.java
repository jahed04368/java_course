package Udemy.Section4;

public class MethodClass2 {
    public static void main(String[] args) {
        //dynamic method better than if statement on class 1
        int highScore = calculateScore(800, 5, 100);
        System.out.println("Your final score was " + highScore);

        highScore =calculateScore(10000, 8, 200);
        System.out.println("Your final score was " + highScore);

    }

    public static int calculateScore(int dynamicSecondScore, int dynamicSecondLevelCompleted, int dynamicSecondBonus) {
        boolean gameOver = true;
        if (gameOver) {
            int finalScore = dynamicSecondScore + (dynamicSecondLevelCompleted * dynamicSecondBonus);
//            System.out.println("Your final score was " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
