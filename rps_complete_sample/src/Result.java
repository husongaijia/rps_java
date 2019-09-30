public enum Result {
    P1WINS("P1WINS"),
    P2WINS("P2WINS"),
    DRAW("DRAW");

    private String text;
    Result(String text) {
        this.text = text;
    }

    public String getString() {
        return text;
    }

}
