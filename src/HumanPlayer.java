import java.util.Scanner;

public class HumanPlayer implements Player {
    private String name;
    private int score = 0;

    public HumanPlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    @Override
    public Item makeChoice() {
        Item[] choices = DrawOption.getItems();

        for (int i = 0; i < choices.length; i++) {
            System.out.println("Select " + (i + 1) + " for " + choices[i].getName());
        }

        int userInput;

        do {
            System.out.print("Option: ");
            Scanner input = new Scanner(System.in);
            userInput = input.nextInt() - 1;
        } while (!(userInput >= 0 && userInput < choices.length));

        return choices[userInput];
    }
}
