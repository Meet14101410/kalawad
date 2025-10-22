#include <iostream>
#include <string>
#include <unordered_map>
#include <vector>

// Represents a key town fact
struct TownFact {
    std::string fact_name;
    std::string value;
};

// Manages information about Kalavad
class KalavadInfoSystem {
private:
    std::unordered_map<std::string, std::string> town_facts;
    std::vector<TownFact> administrative_details;

public:
    KalavadInfoSystem() {
        town_facts["Location"] = "Jamnagar District, Gujarat, India";
        town_facts["Status"] = "Taluka Headquarters (Municipality)";
        town_facts["Economy"] = "Agricultural trading and local commerce";

        administrative_details.push_back({"Taluka", "Kalavad (Shitala)"});
        administrative_details.push_back({"Primary Crops", "Cotton, Groundnut, Oilseeds"});
        administrative_details.push_back({"Connectivity", "State highways to Rajkot, Jamnagar, and Gondal"});
    }

    void display_town_facts() const {
        std::cout << "=== 🇮🇳 Kalavad Town Key Facts ===" << std::endl;
        for (const auto& pair : town_facts) {
            std::cout << pair.first << ": " << pair.second << std::endl;
        }
    }
    
    void display_administrative_details() const {
        std::cout << "\n--- Administrative and Economic Details ---" << std::endl;
        for (const auto& detail : administrative_details) {
            std::cout << detail.fact_name << ": " << detail.value << std::endl;
        }
        std::cout << "=========================================" << std::endl;
    }
};

int main() {
    KalavadInfoSystem info_system;
    
    info_system.display_town_facts();
    info_system.display_administrative_details();

    return 0;
}
