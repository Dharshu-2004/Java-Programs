/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class InversionPairs
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<n;i++){
		    for(int j=i;j<n;j++){
		        if(arr[i]>arr[j]){
		            sum++;
		        }
		    }
		}System.out.println("The sum of inversions pairs are:"+sum);
	
	}
}