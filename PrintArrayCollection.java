import java.util.*;
public class PrintArrayCollection{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> arr= new ArrayList<Integer>();
        Collections.addAll(arr,31,15,19,26);
        System.out.println(arr);
    }
}