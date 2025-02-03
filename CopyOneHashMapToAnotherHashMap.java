import java.util.HashMap;
import java.util.Map;

public class CopyOneHashMapToAnotherHashMap {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        Map<String, Integer> hashMap2 = new HashMap<String, Integer>();
        hashMap2.putAll(hashMap);
        System.out.println(hashMap2);
    }
}
