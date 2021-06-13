import java.util.Arrays;

public class SimplifiedTennisGame {

    private static final String INITIAL_VERBAL_SCORE = "Love all";
    private static final String DEUCE = "Deuce";
    private static final int MIN_POINTS_WIN = 4;
    private static final int MIN_ADVANTAGE_WIN = 2;

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


    public void createScore(int firstPlayerScore, int secondPlayerScore) {
        if (firstPlayerScore < 0 || secondPlayerScore < 0)
            throw new IncorrectScore("Score can not be less than zero");
        if (firstPlayerScore > MIN_POINTS_WIN || secondPlayerScore > MIN_POINTS_WIN) {
            if (Math.abs(firstPlayerScore - secondPlayerScore) > MIN_ADVANTAGE_WIN)
                throw new IncorrectScore("Difference between scores is wrong");
        }
        if (firstPlayerScore == secondPlayerScore)
            verbalScore = findVerbalWhenScoresAreEqual(firstPlayerScore);
        else if (firstPlayerScore >= MIN_POINTS_WIN || secondPlayerScore >= MIN_POINTS_WIN)
            verbalScore = findComplexVerbal(firstPlayerScore, secondPlayerScore);
        else
            verbalScore = findStandardFit(firstPlayerScore) + ", " + findStandardFit(secondPlayerScore);

    }

    private String findComplexVerbal(int firstPlayerScore, int secondPlayerScore) {

        String currentlyBetterPlayer;

        if (firstPlayerScore > secondPlayerScore)
            currentlyBetterPlayer = firstPlayer;
        else currentlyBetterPlayer = secondPlayer;

        String lastName = Arrays.stream(currentlyBetterPlayer.split(" ")).toArray()[1].toString();
        if (Math.abs(firstPlayerScore - secondPlayerScore) == MIN_ADVANTAGE_WIN)
            return "Game " + lastName;

        return "Advantage " + lastName;
    }

    private String findVerbalWhenScoresAreEqual(int score) {
        if (score == 0)
            return INITIAL_VERBAL_SCORE;
        if (score >= MIN_POINTS_WIN - 1)
            return DEUCE;
        return verbalScore = findStandardFit(score) + " all";
    }

    private String findStandardFit(int score) {
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
}
