/*Java Program to Remove a Specific Element From a Collection
Input: ArrayList : [10, 20, 30, 1, 2]
            Index: 1 
Output: ArrayList : [10, 30, 1, 2]
Explanation: Removed element from index 1.*/
import java.util.*;
public class RemoveIndexedValue{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l= new ArrayList<Integer>();
        for(int i=11;i<99;i=i+4){
            l.add(i);
        }
        System.out.println("Before removing the value of index 1: ");
        System.out.println(l);
        l.remove(1);
        System.out.println("After removing the value of index 1: ");
        System.out.println(l);
    }
}