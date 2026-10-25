
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        
    }
    public static void printKeys(HashMap<String,String> hashmap) {
        for (String keys : hashmap.keySet()) {
            System.out.println(keys);
        }        
    }

    public static void printKeysWhere(HashMap<String, String> hashmap, String text) {
        for (String key : hashmap.keySet()) {
            if (!key.contains(text)) {
                continue;
            }
            System.out.println(key);
        }
    }

    public static void printValuesOfKeysWhere(HashMap<String, String> hashmap, String namePart) {
        for (String key : hashmap.keySet()) {
            if (!key.contains(namePart)) {
                continue;
            }
            System.out.println(hashmap.get(key));
        }
    }
}
