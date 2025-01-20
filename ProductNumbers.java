import java.util.*;
public class ProductNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=4;
        int b=5;
        int product =0;
        for(int i=0;i<b;i++){
            product=product+a;
        }
        System.out.println("product of "+a+" and "+b+" is "+product);
        
    }
}