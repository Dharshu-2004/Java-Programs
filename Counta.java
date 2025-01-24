import java.util.*;
public class Counta{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next();
        System.out.println("Enter the index");
        int n=sc.nextInt();
        int count=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("The count of a is: "+count);
    }
}