import java.util.HashSet;
import java.util.Scanner;

public class UserInputHandler {
    private Scanner inputScanner;

    public UserInputHandler() {
        inputScanner = new Scanner(System.in);
    }

    public HashSet<String> readInput() {
        System.out.print("> ");
        String userInput = inputScanner.nextLine().trim().toLowerCase();
        String[] words = userInput.split("\\s+");
        HashSet<String> wordSet = new HashSet<>();
        for (String word : words) {
            wordSet.add(word);
        }
        return wordSet;
    }

    public void shutdown() {
        inputScanner.close();
    }
}
