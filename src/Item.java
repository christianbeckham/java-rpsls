import java.util.Arrays;
import java.util.List;

public class Item {
    private final String name;
    private final String[] beats;

    public Item(String name, String[] beats) {
        this.name = name;
        this.beats = beats;
    }

    public String getName() {
        return this.name;
    }

    public boolean outcome(String opponent) {
        String opponentLowercase = opponent.toLowerCase();
        List<String> opponentList = Arrays.asList(this.beats);
        return opponentList.contains(opponentLowercase);
    }
}
