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
        System.out.println("New Zealand");
        
        //remove keys
        capCities.remove("USA");
        System.out.println(capCities);
        
        //check the size
        System.out.println(capCities.size());
        
        // print all keys
        for(String i : capCities.keySet()){
            System.out.println(i);
        }
        
        //print all values
        for(String i : capCities.values()){
            System.out.print(i);
        }
        
        //loop through hashmap and print all countries that contains a
        for(String i : capCities.keySet()){
            System.out.println("Keys" + i + "Values" + capCities.get(i));
            if(i.toLowerCase().contains("a")){
                System.out.println("Country " + i + " capital " + capCities.get(i));
            }
        }
    }
}
