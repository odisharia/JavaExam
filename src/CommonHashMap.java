import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Owl on 18.10.15.
 */
public class CommonHashMap {
    public static void main(String[] args) {
        Map<String, String> map1 = new HashMap<String, String>();
        Map<String, String> map2 = new HashMap<String, String>();
        map1.put("Geolab", "Dzerski");
        map1.put("Seriali", "Silicon Valley");
        map1.put("Zamtari", "Civi");
        map1.put("Irakli", "Mdzinara");
        map1.put("Aba", "Ho");

        map2.put("Irakli", "Mdzinara");
        map2.put("Geolab", "Dzerski");
        map2.put("Harry", "Potter");
        map2.put("Tbilisoba", "mwvadi");
        map2.put("Aba", "He");

        System.out.println(commonKeyValuePairs(map1, map2));


    }
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2){
        int i = 0:
        for(Map.Entry<String, String> entryMapA:map1.entrySet())
        {
            if(map2.containsKey(entryMapA.getKey()) i++;
        }
        return i;
    }


}
