import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RpsTest {
    private Rps rps;
    private String p1;
    private String p2;

    @Before
    public void setUp() {
        rps = new Rps();
    }

    @Test
    public void p1がrockでp2がpaperのときp2Winsを返す() {
        p1 = "rock";
        p2 = "paper";


        String result = rps.play(p1, p2);


        assertEquals(result, "p2Wins");

    }

    @Test
    public void p1がrockでp2がrockのときtieを返す() {
        p1 = "rock";
        p2 = "rock";

        String result = rps.play(p1, p2);

        assertEquals(result, "tie");

    }

    @Test
    public void p1がrockでp2がscissorsのときp1Winsを返す() {
        p1 = "rock";
        p2 = "scissors";

        String result = rps.play(p1, p2);

        assertEquals(result, "p1Wins");

    }

    @Test
    public void p1がpaperでp2がpaperのときtieを返す() {
        p1 = "paper";
        p2 = "paper";


        String result = rps.play(p1, p2);


        assertEquals(result, "tie");

    }

    @Test
    public void p1がpaperでp2がrockのときp1Winsを返す() {
        p1 = "paper";
        p2 = "rock";


        String result = rps.play(p1, p2);


        assertEquals(result, "p1Wins");

    }

    @Test
    public void p1がpaperでp2がscissorsのときp2Winsを返す() {
        p1 = "paper";
        p2 = "scissors";


        String result = rps.play(p1, p2);


        assertEquals(result, "p2Wins");

    }

    @Test
    public void p1がscissorsでp2がpaperのときp1Winsを返す() {
        p1 = "scissors";
        p2 = "paper";


        String result = rps.play(p1, p2);


        assertEquals(result, "p1Wins");

    }

    @Test
    public void p1がscissorsでp2がrockのときp2Winsを返す() {
        p1 = "scissors";
        p2 = "rock";


        String result = rps.play(p1, p2);


        assertEquals(result, "p2Wins");

    }

    @Test
    public void p1がscissorsでp2がscissorsのときtieを返す() {
        p1 = "scissors";
        p2 = "scissors";


        String result = rps.play(p1, p2);


        assertEquals(result, "tie");

    }
}
