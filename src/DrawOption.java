abstract class DrawOption {

    private static final Item[] items = {
        new Rock(new String[]{"scissors", "lizard"}),
        new Paper(new String[]{"rock", "spock"}),
        new Scissor(new String[]{"paper", "lizard"}),
        new Lizard(new String[]{"paper", "spock"}),
        new Spock(new String[]{"rock", "scissors"}),
    };

    public static Item[] getItems() {
        return items;
    }
}
