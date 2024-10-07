import java.util.Scanner;

public class ValinSupportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Valin Technical Support System.");
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");

        String input;
        do {
            System.out.print("> ");
            input = scanner.nextLine();

            if (!input.equalsIgnoreCase("bye")) {
                System.out.println("That sounds interesting. Tell me more...");
            }

        } while (!input.equalsIgnoreCase("bye"));

        System.out.println("Goodbye! Thank you for using Valin Technical Support.");
        scanner.close();
    }
}
