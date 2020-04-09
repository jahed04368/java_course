package Udemy.Section4;

public class MethodClass2 {
    public static void main(String[] args) {
        //dynamic method better than if statement on class 1
        gameDynamicIf(800,5,100);
        gameDynamicIf(10000,8,200);
}
    public static void gameDynamicIf(int dynamicSecondScore,int dynamicSecondLevelCompleted,int dynamicSecondBonus){
        boolean gameOver = true;
        if (gameOver) {
            int finalScore = dynamicSecondScore + (dynamicSecondLevelCompleted * dynamicSecondBonus);
            System.out.println("Your final score was " + finalScore);
        }
    }
}
