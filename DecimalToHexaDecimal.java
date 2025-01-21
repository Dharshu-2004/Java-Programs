import java.util.*;
public class DecimalToHexaDecimal{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        char hex[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexa=" ";
        int hexadecimal=0;
        while(num>0){
            int digit=num%16;
            hexa=hex[digit] + hexa;
            num=num/16;
        }
        System.out.println(hexa);
        
    }
}