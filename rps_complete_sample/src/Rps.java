public class Rps {
    public String play(String p1, String p2) {
        if (p2.equals(p1)){
            return "tie";
        }
        if ((p1.equals("rock") && p2.equals("scissors")) || (p1.equals("paper") && p2.equals("rock")) || (p1.equals("scissors") && p2.equals("paper"))) {
            return "p1Wins";
        }
        return "p2Wins";
    }
}
