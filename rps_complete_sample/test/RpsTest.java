import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RpsTest {
    private Rps rps;

    @Before
    public void setUp() {
        rps = new Rps();
    }

    @Test
    public void p1がrockでp2がpaperのときp2が勝つ() {
        String result = rps.play(Hand.ROCK.getString(), Hand.PAPER.getString());


        assertEquals(result, Result.P2WINS.getString());
    }

    @Test
    public void p1がrockでp2がrockのときあいこ() {
        String result = rps.play(Hand.ROCK.getString(), Hand.ROCK.getString());

        assertEquals(result, Result.DRAW.getString());
    }

    @Test
    public void p1がrockでp2がscissorsのときp1が勝つ() {
        String result = rps.play(Hand.ROCK.getString(), Hand.SCISSORS.getString());

        assertEquals(result, Result.P1WINS.getString());
    }

    @Test
    public void p1がpaperでp2がpaperのときあいこ() {
        String result = rps.play(Hand.PAPER.getString(), Hand.PAPER.getString());


        assertEquals(result, Result.DRAW.getString());
    }

    @Test
    public void p1がpaperでp2がrockのときp1が勝つ() {
        String result = rps.play(Hand.PAPER.getString(), Hand.ROCK.getString());


        assertEquals(result, Result.P1WINS.getString());
    }

    @Test
    public void p1がpaperでp2がscissorsのときp2が勝つ() {
        String result = rps.play(Hand.PAPER.getString(), Hand.SCISSORS.getString());


        assertEquals(result, Result.P2WINS.getString());
    }

    @Test
    public void p1がscissorsでp2がpaperのときp1が勝つ() {
        String result = rps.play(Hand.SCISSORS.getString(), Hand.PAPER.getString());


        assertEquals(result, Result.P1WINS.getString());
    }

    @Test
    public void p1がscissorsでp2がrockのときp2が勝つ() {
        String result = rps.play(Hand.SCISSORS.getString(), Hand.ROCK.getString());


        assertEquals(result, Result.P2WINS.getString());
    }

    @Test
    public void p1がscissorsでp2がscissorsのときあいこ() {
        String result = rps.play(Hand.SCISSORS.getString(), Hand.SCISSORS.getString());


        assertEquals(result, Result.DRAW.getString());
    }
}
