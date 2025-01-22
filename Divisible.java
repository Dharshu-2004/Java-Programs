import java.util.*;
public class Divisible
{
    
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
        
        //sum the values in the array
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
        }
        if(sum%arr[0]==0||sum%arr[n-1]==0){
            System.out.println("yes");
        }
        else{
            System.out.println("No");
        }
 
    }
}
/*
Input:
5
10 50 75 15 25

Output:
Yes

Explanation:
The sum of the array values is 175 and is divisible by 25.

Example Input/Output 2:
Input:
5
10 50 75 15 22

Output:
No*/