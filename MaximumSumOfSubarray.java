import java.util.Scanner;
public class MaximumSumOfSubarray{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n=sc.nextInt();
        System.out.println("Enter the elements of the array:");
        int[] arr=new int[n];
        for(int i=0 ;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Entered array is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int k=3;
        int maxsum=0;
        int currentsum=0;
        for(int i = 0;i<k;i++){
            currentsum+=arr[i];
        }
        maxsum=currentsum;
        for(int i=1;i<n-k+1;i++){
            currentsum=currentsum-arr[i-1]+arr[i+k-1];
            if(maxsum<currentsum){
                maxsum=currentsum;
            }
        }
        System.out.print("The maximum  sum of sub array is: "+maxsum);
        
    }
}