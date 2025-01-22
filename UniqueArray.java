import java.util.*;
public class UniqueArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        boolean unique=true;
        System.out.println("The unique elements are:");
        for(int i=0;i<n;i++){
            count=0;
            for(int j=0;j<n;j++){
                if(i!=j){
                    if(arr[i]==arr[j]){
                        count++;
                    }
                }
            }
            if(count ==0){
                
                System.out.print(arr[i]+" ");
                unique=false;
                
            }
        }
        if(unique){
            System.out.println("No unique elements present in the array");
        }
        
        
    }
}