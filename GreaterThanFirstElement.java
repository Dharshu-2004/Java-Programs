import java.util.*;
class GreaterThanFirstElement{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n= sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int count=1;
        System.out.println("Elements that are greater and equal to the first element: ");
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}