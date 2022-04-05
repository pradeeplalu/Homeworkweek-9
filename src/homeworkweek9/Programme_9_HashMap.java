package homeworkweek9;

import java.util.HashMap;

public class Programme_9_HashMap {

    public static void main(String[] args) {

        // Create a HashMap object called capitalCities

        HashMap<String, Integer> capitalCities = new HashMap<String, Integer>();

        // Add keys and values (Country, Numbers)
        capitalCities.put("England", 10);
        capitalCities.put("Germany", 20);
        capitalCities.put("Norway", 30);
        capitalCities.put("USA", 40);
        System.out.println(capitalCities);
    }
}

