public class Rps {
    public String play(String p1, String p2) {
        if (p2.equals(p1)) {
            return Result.DRAW.getString();
        }
        if (isP1Wins(p1, p2)) {
            return Result.P1WINS.getString();
        }
        return Result.P2WINS.getString();
    }

    private boolean isP1Wins(String p1, String p2) {
        return (p1.equals(Hand.ROCK.getString()) && p2.equals(Hand.SCISSORS.getString()))
                || (p1.equals(Hand.PAPER.getString()) && p2.equals(Hand.ROCK.getString()))
                || (p1.equals(Hand.SCISSORS.getString()) && p2.equals(Hand.PAPER.getString()));
    }
}
