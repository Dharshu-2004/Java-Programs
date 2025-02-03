/* Array to LinkedList*/
import java.util.*;
class ArrayToLinkedList {
    public static void main(String[] args)
    {   List <String> l1 = new ArrayList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        LinkedList<String> l2= new LinkedList<String>();
        for (String x :l1) 
            l2.add(x); 
  
        System.out.println(l2);
    }
}