package Udemy.Section4;

public class methodChallenge3 {
    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Jahed", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Percy", highScorePosition);
    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println("My name is " + playerName + " and I managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore) {
//        if (playerScore >= 1000) {
//            return 1;
//        } else if (playerScore >= 500) {
//            return 2;
//        } else if (playerScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if (playerScore >= 1000) {
            return position = 1;
        } else if (playerScore >= 500) {
            return position = 2;
        } else if (playerScore >= 100) {
            return position = 3;
        }
        return position;
    }
}
