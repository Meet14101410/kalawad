import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Represents a key town detail
class TownDetail {
    private String name;
    private String value;

    public TownDetail(String name, String value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return name + ": " + value;
    }
}

// Manages information about Kalavad
public class KalavadInfoSystem {
    private Map<String, String> townFacts;
    private List<TownDetail> administrativeDetails;

    public KalavadInfoSystem() {
        townFacts = new HashMap<>();
        townFacts.put("Location", "Jamnagar District, Gujarat, India");
        townFacts.put("Status", "Taluka Headquarters (Municipality)");
        townFacts.put("Economy", "Agricultural trading and local commerce");

        administrativeDetails = new ArrayList<>();
        administrativeDetails.add(new TownDetail("Taluka", "Kalavad (Shitala)"));
        administrativeDetails.add(new TownDetail("Primary Crops", "Cotton, Groundnut, Oilseeds"));
        administrativeDetails.add(new TownDetail("Connectivity", "State highways to Rajkot, Jamnagar, and Gondal"));
    }

    public void displayTownFacts() {
        System.out.println("=== 🇮🇳 Kalavad Town Key Facts ===");
        for (Map.Entry<String, String> entry : townFacts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void displayAdministrativeDetails() {
        System.out.println("\n--- Administrative and Economic Details ---");
        for (TownDetail detail : administrativeDetails) {
            System.out.println(detail.toString());
        }
        System.out.println("=========================================");
    }

    public static void main(String[] args) {
        KalavadInfoSystem infoSystem = new KalavadInfoSystem();
        
        infoSystem.displayTownFacts();
        infoSystem.displayAdministrativeDetails();
    }
}
