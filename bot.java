import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) {
            System.out.print("What are you looking for? ");
            input = scanner.nextLine().toLowerCase();
            if (input.contains("weather")) {
                System.out.println("The weather today is sunny!");
            } else if (input.contains("news")) {
                System.out.println("The latest news is that there is a new virus outbreak in Asia.");
            } else if (input.contains("movie")) {
                System.out.println("The best movie to watch right now is The Godfather.");
            } else if (input.contains("restaurant")) {
                System.out.println("The best restaurant in town is Chez Jacques.");
            } else if (input.contains("exit")) {
                break;
            } else {
                System.out.println("I'm sorry, I don't understand what you're looking for.");
            }
        }
    }
}
