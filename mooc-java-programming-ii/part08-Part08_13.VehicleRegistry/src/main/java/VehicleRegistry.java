import java.util.ArrayList;
import java.util.HashMap;

public class VehicleRegistry {
    private HashMap<LicensePlate, String> vehicleHashMap;

    public VehicleRegistry() {
        this.vehicleHashMap = new HashMap<>();
    } 

    public boolean add(LicensePlate licensePlate, String owner) {
        if (this.vehicleHashMap.containsKey(licensePlate)) {
            return false;
        }
        this.vehicleHashMap.put(licensePlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        if (!this.vehicleHashMap.containsKey(licensePlate)) {
            return null;
        }
        return this.vehicleHashMap.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (!this.vehicleHashMap.containsKey(licensePlate)) {
            return false;
        }
        this.vehicleHashMap.remove(licensePlate);
        return true;
    } 

    public void printLicensePlates() {
        int i = 1;
        for (LicensePlate liPlate : this.vehicleHashMap.keySet()) {
            System.out.println(i + ": " + liPlate);
            i++;
        }
    }

    public void printOwners() {
        ArrayList<String> owners = new ArrayList<>();
        for (String nonRegulatedOwner : this.vehicleHashMap.values()) {
            if (!owners.contains(nonRegulatedOwner)) {
                owners.add(nonRegulatedOwner);
            }
        }
        for (String owner : owners) {
            System.out.println(owner);
        }
    }
}
