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
        switch (score) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
        }
        return null;
    }


    public void createScore(int firstPlayerScore, int secondPlayerScore) {

        if (firstPlayerScore == 0 && secondPlayerScore == 0)
            verbalScore = INITIAL_VERBAL_SCORE;
        else if (firstPlayerScore == secondPlayerScore) {
            if (firstPlayerScore >= 3)
                verbalScore = "Deuce";
            else
                verbalScore = findMatch(firstPlayerScore) + " all";
        } else
            verbalScore = findMatch(firstPlayerScore) + ", " + findMatch(secondPlayerScore);
    }
}
