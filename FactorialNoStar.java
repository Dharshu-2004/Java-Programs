import java.util.*;
public class FactorialNoStar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact=mul(fact,i);
        }
       System.out.println("The factorial is "+fact);
        
    }
    public static int mul(int a,int b){
        int result =0;
        for(int i=0;i<b;i++){
            result=result+a;
        }
        return result;
    }
}