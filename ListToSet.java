/* List to Set*/
import java.util.*;
class ListToSet {
     
    public static void main(String[] args)
    {   LinkedList<String> l1 = new LinkedList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        Set<String> l2= new HashSet<String>();
        for (String x :l1) 
            l2.add(x); 
  
        System.out.println(l2);
    }
}