import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SimplifiedTennisGameTest {


    @Test
    public void scoreShouldBeLoveAll_atTheBeginningOfTheGame() {
        SimplifiedTennisGame game = new SimplifiedTennisGame();
        assertThat(game.getVerbalScore(), equalTo("Love all"));
    }

    @Test
    public void scoreShouldBeFifteenZero() {
        SimplifiedTennisGame game = new SimplifiedTennisGame();
        game.createScore(1, 0);
        assertThat(game.getVerbalScore(), equalTo("Fifteen, Love"));
    }

    @Test
    public void scoreShouldBeFortyThirty() {
        SimplifiedTennisGame game = new SimplifiedTennisGame();
        game.createScore(3, 2);
        assertThat(game.getVerbalScore(), equalTo("Forty, Thirty"));
    }

    @Test
    public void scoreShouldBeFifteenAll() {
        SimplifiedTennisGame game = new SimplifiedTennisGame();
        game.createScore(1, 1);
        assertThat(game.getVerbalScore(), equalTo("Fifteen all"));
    }

    @Test
    public void scoreShouldBeDeuce(){
        SimplifiedTennisGame game = new SimplifiedTennisGame();
        game.createScore(3, 3);
        assertThat(game.getVerbalScore(), equalTo("Deuce"));
    }

    @Test
    public void scoreShouldBeGameForSecondPlayer(){
        SimplifiedTennisGame game = new SimplifiedTennisGame("John Smith", "Andy Davis");
        game.createScore(2, 4);
        assertThat(game.getVerbalScore(), equalTo("Game Davis"));
    }

}
