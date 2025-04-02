import java.util.HashMap; //import the hashmap class
/**
 * practice/learning for HashMaps in java
 *
 * Fleur
 * 3/4
 */
public class CapitalCities
{
    /**
     * Main
     */
    public static void main(String[] args)
    {
        // Create hashmap
        HashMap<String, String> capCities = new HashMap<String, String>();
        
        // Add keys and values (countries and Cities)
        capCities.put("New Zealand", "Wellington");
        capCities.put("Austrailia", "Canberra");
        capCities.put("Germany", "Berlin");
        capCities.put("Norway", "Oslo");
        capCities.put("USA", "Washington DC");
        
        System.out.println(capCities);
    }
}
