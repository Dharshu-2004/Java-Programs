/*number of integers
in the range interval [n1, n2] [both inclusive] which have no repeated digits.


Fore.g.


Suppose n1=11 and n2=15


Thereisthenumber11,which
has repeateddigits,but12,13,14,and15haveno repeated digits. So, the output is
4.*/
import java.util.*;
public class RepeatedDigits
{
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1=101; int n2=200;int n= n2-n1;
    int count=0;int j=0;
    for(int i=n1;i<=n2;i++){
        int dup=i; j=0;
        while(dup>0){
            int digit=dup%10;
            if(digit==j){
                n--;
                break;
            }
            j=digit;
            dup=dup/10;
        }
    }
   System.out.println(n); 
}
}


     