import java.util.Arrays;

public class SimplifiedTennisGame {

    public static final String INITIAL_VERBAL_SCORE = "Love all";
    public static final String DEUCE = "Deuce";
    private final String firstPlayer;
    private final String secondPlayer;
    private String verbalScore;

    public SimplifiedTennisGame() {
        this("no_name", "no_name2");
        verbalScore = INITIAL_VERBAL_SCORE;
    }

    public SimplifiedTennisGame(String firstPlayer, String secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
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

        if (firstPlayerScore == secondPlayerScore) {
            verbalScore = findVerbalWhenScoresAreEqual(firstPlayerScore);
        } else if (firstPlayerScore == 4) {
            verbalScore = "Game " + Arrays.stream(firstPlayer.split(" ")).toArray()[1];
        } else if (secondPlayerScore == 4) {
            verbalScore = "Game " + Arrays.stream(secondPlayer.split(" ")).toArray()[1];
        } else
            verbalScore = findMatch(firstPlayerScore) + ", " + findMatch(secondPlayerScore);

    }

    private String findVerbalWhenScoresAreEqual(int score) {
        if (score == 0)
            return INITIAL_VERBAL_SCORE;
        if (score >= 3)
            return DEUCE;
        return verbalScore = findMatch(score) + " all";
    }
}
