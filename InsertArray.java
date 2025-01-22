import java.util.*;
public class InsertArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n+1];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        n++;
        System.out.println("Enter the data to be added:");
        int data = sc.nextInt();
        System.out.println("Enter the position: ");
        int p=sc.nextInt();
        for(int i=n-1;i>=p;i--){
            arr[i]=arr[i-1];
        }
        arr[p-1]=data;
        System.out.println("The array after inserting: ");
        for(int i:arr){
            System.out.print(i+" ");
        }
        
    }
}