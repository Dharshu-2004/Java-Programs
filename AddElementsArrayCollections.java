/* How to Add an Element in Java ArrayList?
Input: Number of Elements to be Added: 3
            Elements to be Added : "A" , "B" , "C"
Output:  list=[ A, B, C ]*/
import java.util.*;
public class AddElementsArrayCollections{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        List<Integer> l= new ArrayList<Integer>();
        for(int i=1;i<=n;i++){
            l.add(i);
        }
        System.out.println(l);
    }
}