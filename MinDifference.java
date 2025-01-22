import java.util.*;
public class MinDifference
{
    
   public static void main(String[] args)
   {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        
        int[] arr=new int[n];
        int[] array= new int[n*(n-1)/2];
        
        System.out.println("Enter elements"); 
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        
        int k=0;
        for(int i=0;i<n;i++){
            
            for(int j=i+1;j<n;j++){
                array[k++]=Math.abs(arr[i]-arr[j]);
                
            }
        }
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        int min=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
 
    }
}
