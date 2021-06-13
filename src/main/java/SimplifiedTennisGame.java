public class SimplifiedTennisGame {

    public static final String INITIAL_VERBAL_SCORE = "Love all";
    public static final String DEUCE = "Deuce";
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
            verbalScore = findVerbalWhenScoresAreEqual(firstPlayerScore);
        } else
            verbalScore = findMatch(firstPlayerScore) + ", " + findMatch(secondPlayerScore);
    }

    private String findVerbalWhenScoresAreEqual(int firstPlayerScore) {
        if (firstPlayerScore >= 3)
            return DEUCE;
        return verbalScore = findMatch(firstPlayerScore) + " all";
    }
}
