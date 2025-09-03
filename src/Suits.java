public enum Suits {
    HEARTS("♥"),
    TILES("♦"),
    CLOVERS("♣"),
    PIKES("♠");

    private final String title;

    Suits(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return title;
    }
}
