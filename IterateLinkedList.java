/* Iterate Linked List*/
import java.util.*;
class IterateLinkedList {
     
    public static void main(String[] args)
    {   LinkedList<String> l1 = new LinkedList<String>();
        l1.add("a");
        l1.add("b");
        l1.add("c");
        l1.add("d");
        Iterator it = l1.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
    }
}