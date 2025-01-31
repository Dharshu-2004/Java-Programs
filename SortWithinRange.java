import java.util.*;
public class SortWithinRange{
    public static void main (String[] args) {
        
        long[] arr={56,500,25,20000,44};
        int n= arr.length;
        int x=99;int y=10;int start=0;int stop=0;
        if(x>y){
             start=y;
             stop=x;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((arr[i]<stop&&arr[i]>start)&&(arr[j]<stop&&arr[j]>start)&&(i!=j)){
                   if(arr[i]<arr[j]){
                       long temp=arr[i];
                       arr[i]=arr[j];
                       arr[j]=temp;
                   }
                }
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}