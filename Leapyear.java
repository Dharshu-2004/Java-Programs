import java.util.*;
public class Leapyear{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int y=sc.nextInt();
        if((y%4==0||y%400==0)&&y%100!=0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("not a Leap year");
        }
    }
}