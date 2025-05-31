import java.util.*;

public class AIChatbot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> responses = new HashMap<>();

        responses.put("hi", "Hello! How can I assist you today?");
        responses.put("bye", "Goodbye! Have a nice day!");
        responses.put("name", "I am an AI chatbot created to help you.");

        System.out.println("Chatbot: Type 'bye' to exit.");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine().toLowerCase();
            if (userInput.equals("bye")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }
            String reply = responses.getOrDefault(userInput, "I'm sorry, I don't understand that.");
            System.out.println("Chatbot: " + reply);
        }
    }
}