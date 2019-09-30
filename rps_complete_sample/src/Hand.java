public enum Hand {
    ROCK("ROCK"),
    PAPER("PAPER"),
    SCISSORS("SCISSORS");


    private String text;

    Hand(String text) {
        this.text = text;
    }

    public String getString() {
        return text;
    }
    }
