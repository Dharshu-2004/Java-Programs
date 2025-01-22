import java.util.*;

public class RightRotation {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the rotation digit:");
        int p = sc.nextInt();
        p = p % n;
       
       for(int i=0;i<p;i++){
           
          int t=arr[n-1];
          for(int j=n-1;j>0;j--){
              arr[j]=arr[j-1];
          }
          arr[0]=t;
       }
       
       for(int i:arr){
           System.out.print(i+" ");
       }
    }
}
