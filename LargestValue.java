import java.util.Scanner;
public class LargestValue{
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no of elements in an array: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter the values");
		for (int i=0;i<n;i++){
		    arr[i]=sc.nextInt();
		}
		int largest=arr[0];
		for(int i=1;i<arr.length;i++){
		    if(arr[i] > largest){
		        largest= arr[i];
		    }
		}
		System.out.println("The largest value in the array: "+largest);
	
	}
}