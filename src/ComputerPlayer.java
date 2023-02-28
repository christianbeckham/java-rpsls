import java.util.Random;

public class ComputerPlayer implements Player {

    private String name = "Computer";
    private int score = 0;

    public String getName() {
        return this.name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public Item makeChoice() {
        Item[] items = DrawOption.getItems();
        Random random = new Random();
        int randomInt = random.nextInt(items.length - 1);
        return items[randomInt];
    }
}
