/*2.
The function accepts two positive integers ‘r’ and ‘unit’ and a positive integer array ‘arr’ of size ‘n’ as its argument ‘r’ represents the number of rats present in an area, ‘unit’ is the amount of food each rat consumes and each ith element of array ‘arr’ represents the amount of food present in ‘i+1’ house number, where 0 <= i

Line 1: Number of rats (positive integer) Line 2: Food consumption per rat (positive integer) Line 3: Number of houses (positive integer) Line 4: Food in each house (space-separated positive integers)

1 <= Number of rats (r) <= 10^5 1 <= Food consumption per rat (unit) <= 100 1 <= Number of houses (n) <= 10^5 1 <= Amount of food in each house <= 100

An integer representing the house number with enough food for all rats. Return -1 if the array is null. Return 0 if total house food is insufficient for all rats.

5
3
4
2 1 5 2


0


10
1
7
2 4 1 6 3 7 9


4*/
import java.util.*;
public class RatsProgram
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number of rats: ");
	int r= sc.nextInt();
	System.out.println("Enter the food consume by each rat: ");
	int u=sc.nextInt();
	System.out.println("Enter the number of house: ");
	int n= sc.nextInt();
	int[] arr= new int[n];
	for(int i=0;i<arr.length;i++){
	    arr[i]=sc.nextInt();
	}
	int total=r*u;int sum=0;
	for(int i=0;i<arr.length;i++){
	    sum=sum+arr[i];
	    if(sum>=total){
	        System.out.println("Food is satisfied in the "+(i+1)+" house.");
	        return;
	    }
	}
	if(sum<total){
	   System.out.println("0 insufficient"); 
	}
}
}