import java.util.*;
public class DecimalBinary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int j=0;
        int[] arr=new int[10];
        while(num>0){
            int digit=num%2;
            arr[j]=digit;
            j++;
            num=num/2;
        }
        for (int i = j - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}