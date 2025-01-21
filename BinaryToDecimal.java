import java.util.*;
public class BinaryToDecimal{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int binary=sc.nextInt();
        int temp=binary;
        int count=0;
        int sum=0;
        while(temp>0){
            temp=temp/10;
            count++;
        }
        while(binary>0){
            
            for(int i=0;i<count;i++){
                int digit=binary%10;
                int prod=digit*(int)Math.pow(2,i);
                sum+=prod;
                binary/=10;
            }
            
            
        }
        System.out.println(sum);
    }
}