/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class DoctorPatient
{
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		
		int arr[] = new int[7];
		int sum=0;
		for(int i=0;i<arr.length;i++){
		    arr[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr.length;i++){
		    if(arr[i]>0 && arr[i]<17){
		        sum=sum+200;
		    }
		    else if(arr[i]>=17 && arr[i]<40){
		       sum=sum+400;
		    }
		    else if(arr[i]>=40){
		        sum=sum+300;
		    }
		}
		System.out.println(sum);
	}
}