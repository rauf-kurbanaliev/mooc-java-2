import java.util.HashMap;

public class Abbreviations {
    private HashMap<String, String> abbreviation;

    public Abbreviations() {
        this.abbreviation = new HashMap<>();
    }

    public void addAbbreviation(String abbreviation, String explanation) {
        if (hasAbbreviation(abbreviation)) {
            return;
        } else {
            this.abbreviation.put(abbreviation, explanation);
        }
    }

    public boolean hasAbbreviation(String abbreviationString) {
        String abbreviation = sanitazedString(abbreviationString);

        if (this.abbreviation.containsKey(abbreviation)) {
            return true;
        } else {
            return false;
        }
    }

    public String findExplanationFor(String abbreviation) {
        return this.abbreviation.get(abbreviation);
    }

    public String sanitazedString(String string) {
        if (string == null) {
            return " ";
        }
        string = string.toLowerCase();
        return string.trim();
    }
}
