import java.util.HashMap;
import java.util.Map;

public class WordCountHashMap {

    public static void main(String[] args) {
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        String str= "I like you";
        String[] words = str.split(" ");
 
        for (String word : words) {
            Integer count = hashMap.get(word);
 
            if (count == null) {
                hashMap.put(word, 1);
            } else {
                hashMap.put(word, count + 1);
            }
        }
        System.out.println(hashMap);
    }
}
