import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries in the phone book
        int n = scanner.nextInt();
        scanner.nextLine();  // Consume the newline character

        // Create a phone book as a Map to store the entries
        Map<String, String> phoneBook = new HashMap<>();

        // Populate the phone book
        for (int i = 0; i < n; i++) {
            String name = scanner.next();
            String phoneNumber = scanner.next();
            phoneBook.put(name, phoneNumber);
        }

        // Process queries and print the results
        while (scanner.hasNext()) {
            String query = scanner.next();
            String phoneNumber = phoneBook.getOrDefault(query, "Not found");
            System.out.println(phoneNumber.equals("Not found") ? "Not found" : query + "=" + phoneNumber);
        }

        scanner.close();
    }
}


