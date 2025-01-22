import java.util.*;
public class LastTwoDigit
{
    public static int getLastTwoDigits(int arr[] )
    {
        for(int i=0;i<arr.length;i++)
        {
            int digit=arr[i]%100;
            System.out.printf("%d-%02d ",arr[i],digit);
        }
        return 0;
       
    }
   public static void main(String[] args)
   {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        LastTwoDigit obj= new LastTwoDigit();
        obj.getLastTwoDigits(arr);
 
    }
}
/*Input:
5
1054 50 75102 1500 205

Output:
1054-54 50-50 75102-02 1500-00 205-05*/
