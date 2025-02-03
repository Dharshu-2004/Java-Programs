/*. How to Replace an Element in Java ArrayList?
Input: ArrayList = [A, B, C, D]
            index = 2
            element =' E '
Output: [ A, B, E, D ]*/
import java.util.*;
public class ReplaceUsingCollections{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Character> l= new ArrayList<Character>();
        l.add('A');
        l.add('B');
        l.add('C');
        l.add('D');
        System.out.println("Before setting the value: ");
        System.out.println(l);
        l.set(2,'E');
        System.out.println("After setting the value: ");
        System.out.println(l);
    }
}