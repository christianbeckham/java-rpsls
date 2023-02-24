import java.util.Scanner;

public class Game {

    private HumanPlayer playerOne;
    public Game() {}

    public void displayWelcome() {
        System.out.println("Game has started! \n");
    }

    public void run() {
        String name = this.getPlayerNameInput();
        this.playerOne = new HumanPlayer(name);
        String choice = playerOne.makeChoice();
        System.out.println(playerOne.getName() + " picked " + choice);
    }

    private String getPlayerNameInput() {
        System.out.print("Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
