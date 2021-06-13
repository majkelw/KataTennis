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

}
