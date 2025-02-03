/* Comparing two ArrayList In Java
Input : ArrayList1 = [1, 2, 3, 4],
            ArrayList2 = [4, 2, 3, 1]
Output: Array List are not equal*/
import java.util.*;
class CompareArrayareEqual {
     
    public static void main(String[] args)
    {   List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>();
        Collections.addAll(l1,"a","b");
        Collections.addAll(l2,"a","b");
        System.out.println(l1.equals(l2));
    }
}