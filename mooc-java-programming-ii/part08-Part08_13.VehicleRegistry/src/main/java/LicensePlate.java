
import java.util.Objects;

public class LicensePlate {
    // don't modify existing parts of this class

    // these instance variables have been defined as final, meaning 
    // that once set, their value can't be changed
    private final String liNumber;
    private final String country;

    public LicensePlate(String country, String liNumber) {
        this.liNumber = liNumber;
        this.country = country;
    }

    public String getLiNumber() {
        return this.liNumber;
    }

    public String getCountry() {
        return this.country;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        if (this == object) {
            return true;
        }
        LicensePlate licensePlate = (LicensePlate) object;
        return this.getLiNumber().equals(licensePlate.getLiNumber()) && this.getCountry().equals(licensePlate.getCountry());
    }

    @Override 
    public int hashCode() {
        return Objects.hash(this.liNumber, this.country);
    }

    @Override
    public String toString() {
        return country + " " + liNumber;
    }

}
