import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SpiralMatrix {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the matrix");
        int n=sc.nextInt();
        int value=1;
        int top=0,left =0, bottom=n-1,right=n-1;
        int matrix[][]= new int[n][n];
        while(value<=n*n){
          for(int i=left;i<=right;i++){
            matrix[top][i]=value++;
            
          }top++;
        for(int i=top;i<=bottom;i++){
            matrix[i][right]=value++;
        }right--;
        for(int i=right;i>=left;i--){
            matrix[bottom][i]=value++;
        }bottom--;
        for(int i=bottom;i>=top;i--){
            matrix[i][left]=value++;
        }left++;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }System.out.println();
        }
    }
}