public class SimplifiedTennisGame {

    public static final String INITIAL_VERBAL_SCORE = "Love all";
    private String verbalScore;

    public SimplifiedTennisGame() {
        verbalScore = INITIAL_VERBAL_SCORE;
    }

    public String getVerbalScore() {
        return verbalScore;
    }

    private String findMatch(int score) {
        if (score == 0)
            return "Love";
        else if (score == 1)
            return "Fifteen";
        else if (score == 2)
            return "Thirty";
        else if (score == 3)
            return "Forty";

        return null;
    }

    public void createScore(int firstPlayerScore, int secondPlayerScore) {

        if (firstPlayerScore == 0 && secondPlayerScore == 0)
            verbalScore = INITIAL_VERBAL_SCORE;
        else {
            verbalScore = findMatch(firstPlayerScore) + ", " + findMatch(secondPlayerScore);
        }
    }
}
