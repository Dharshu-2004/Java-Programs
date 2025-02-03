/*nput: Linked_List: [geeks, for, geeks]
Output: 3
Explanation: As there are only 3 elements in the Collection So the value returned is 3.*/
import java.util.*;
public class SizeOfArray{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> l= new ArrayList<Integer>();
        for(int i=11;i<99;i=i+4){
            l.add(i);
        }
        System.out.println("The size of the array list is "+l.size());
    }
}