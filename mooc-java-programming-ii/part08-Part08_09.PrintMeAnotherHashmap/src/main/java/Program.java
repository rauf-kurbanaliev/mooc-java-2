
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("lotm", new Book("Lord Of The Mysteries", 2018, "mystery"));
        printValues(hashmap);
        System.out.println("-----");
        printValueIfNameContains(hashmap, "the myster");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book book : hashmap.values()) {
            System.out.println(book);
        }
    } 

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String name) {
        for (Book book : hashmap.values()) {
            String sanitazedName = sanitazedString(name);
            if (!book.getName().toLowerCase().contains(sanitazedName)) {
                continue;
            }
            System.out.println(book);
        }
    }

    public static String sanitazedString(String name) {
        if (name == null) {
            return " ";
        }
        name = name.toLowerCase();
        return name.trim();
    }
}
