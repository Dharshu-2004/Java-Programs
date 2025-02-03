//Convert array to arraylist
import java.util.*;
class ArrayToArrayList {
      // Main Function
    public static void main(String[] args)
    {   String[] geeks = { "Rahul", "Utkarsh", "Shubham", "Neelam" };
        List<String> al = new ArrayList<String>();
        Collections.addAll(al,geeks);
        System.out.println(al);
    }
}