/*Input : List = [3, 5, 18, 4, 6]
Output: Min value of our list : 3
               Max value of our list : 18
Explanation: Comparison lead to result that the min of the list is 3 and max of list is 18. 
Similarly we can test for other Collections too*/
import java.util.*;
public class CompareUsingCollections{
    public static void main (String[] args) {
        List<Integer> l= new ArrayList<Integer>();
        for(int i=11; i<99;i=i+4){
            l.add(i);
        }
        int min = Collections.min(l);
        int max = Collections.max(l);
        if(min == max){
            System.out.println("All are equal");
        }
        else{
            System.out.println("Min value of our list: "+min);
            System.out.println("Max value of our list: "+max);
        }
    }
}