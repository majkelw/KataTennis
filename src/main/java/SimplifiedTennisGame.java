public class SimplifiedTennisGame {

    private String firstPlayer;
    private String secondPlayer;
    private int firstPlayerScore;
    private int secondPlayerScore;
    private String currentScore;

    public SimplifiedTennisGame(String firstPlayer, String secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.firstPlayerScore = 0;
        this.secondPlayerScore = 0;
        currentScore = "Love all";
    }

    public String getCurrentScore() {
        return currentScore;
    }

    private String findMatch(int score) {
        if (score == 0)
            return "Love";
        else if (score == 1)
            return "Fifteen";

        return null;
    }

    public void createScore(int firstPlayerScore, int secondPlayerScore) {

        this.firstPlayerScore = firstPlayerScore;
        this.secondPlayerScore = secondPlayerScore;
        if (firstPlayerScore == 0 && secondPlayerScore == 0)
            currentScore = "Love all";
        else {
            currentScore = findMatch(firstPlayerScore) + ", " + findMatch(secondPlayerScore);
        }
    }
}
