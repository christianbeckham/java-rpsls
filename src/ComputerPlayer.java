import java.util.Random;

public class ComputerPlayer implements Player {

    private String name = "Computer";

    public String getName() {
        return this.name;
    }

    @Override
    public Item makeChoice() {
        Item[] items = DrawOption.getItems();
        Random random = new Random();
        int randomInt = random.nextInt(items.length - 1);
        return items[randomInt];
    }
}
