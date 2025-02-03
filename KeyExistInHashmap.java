import java.util.HashMap;
import java.util.Map;

public class KeyExistInHashmap {

    public static void main(String[] args) {
        Map<String, String> foodTable = new HashMap<String, String>();

        foodTable.put("A", "Angular");
        foodTable.put("J", "Java");
        foodTable.put("P", "Python");
        foodTable.put("H", "Hibernate");

        for (Map.Entry<String, String> set : foodTable.entrySet()) {
            if (set.getKey().equals("J")) {
                System.out.println("true");
                
            } else {
                System.out.println("false");
               
            }
        }
    }
}
