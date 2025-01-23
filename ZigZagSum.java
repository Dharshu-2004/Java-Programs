/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class ZigZagSum
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=3;
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		int sum=0;
		for(int i=0;i<n;i++){
		    for(int j=0;j<n;j++){
		        if(i==0||i==n-1||i+j==n-1){
		            sum=sum+arr[i][j];
		        }
		    }
		}
		System.out.println("The sum of zig zag values in the array:" ,sum);
		
	}
}