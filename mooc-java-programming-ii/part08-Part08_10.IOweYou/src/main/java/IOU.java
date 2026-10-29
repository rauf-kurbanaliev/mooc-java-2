import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> hashmap;

    public IOU() {
        this.hashmap = new HashMap<>();
    }

    public void setSum(String toWhom, double oweingAmount) {
        toWhom = sanitizedString(toWhom);
        this.hashmap.put(toWhom, oweingAmount);
    }

    public double howMuchDoIOweTo(String toWhom) {
        toWhom = sanitizedString(toWhom);
        return this.hashmap.getOrDefault(toWhom, 0.0);
    }

    public static String sanitizedString(String toWhom) {
        toWhom = toWhom.toLowerCase();
        return toWhom.trim();
    }
}
