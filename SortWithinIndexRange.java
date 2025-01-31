import java.util.*;
public class SortWithinIndexRange{
    public static void main (String[] args) {
        
        long[] arr= {110, 40, 30, 20, 5};
        int n= arr.length;
        int x=0;int y=4;int start=0;int stop=0;
        if(x>y){
             start=y;
             stop=x;
        }
        else{
           start=x;
            stop=y; 
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i<=stop&&i>=start)&&(j<=stop&&j>=start)&&(i!=j)){
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