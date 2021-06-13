public class SimplifiedTennisGame {

    private String firstPlayer;
    private String secondPlayer;

    public SimplifiedTennisGame(String firstPlayer, String secondPlayer) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
    }

    public String getCurrentScore() {
        return "Love all";
    }
}
