//Abundant Number is the number when the sum of its factors are greater of 
//the original Number.
import java.util.*;
public class AbundantNumber{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int temp=num;
        int sum=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                sum=sum+i;
            }
        }
        if(temp<sum){
            System.out.println("Abundant Number");
        }
        else{
            System.out.println("Not a Abundant Number");
        }
    }
}