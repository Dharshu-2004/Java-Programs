
import java.util.*;
public class CarTravellingCost
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the charge before given hours");
    int R1=sc.nextInt();
    System.out.println("Enter the given hours");
    int h=sc.nextInt();
    System.out.println("Enter the charge after given hours");
    int R2=sc.nextInt();
    System.out.println("Enter the total time of travel in minutes");
    int travel=sc.nextInt();
    
    
    int start=R1*h;
    float v= (float)travel/60;
    int value=(int)Math.ceil(v);
    int rem=Math.abs(value-h);
    int prod=rem*R2;
    System.out.println("Total travelling cost is "+(prod+start));
    
}
}


     