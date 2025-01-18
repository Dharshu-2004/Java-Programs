import java.util.Scanner;
public class MatrixAddition{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
    int rows=3;int cols=3;
    int[][] a=new int[rows][cols];
    int[][] b=new int[rows][cols];
    int[][] c=new int[rows][cols];
    System.out.println("Enter the values for the Matrix 1: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            a[i][j]=sc.nextInt();
        }
    }
     System.out.println("Enter the values for the Matrix 2: ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            b[i][j]=sc.nextInt();
        }
    }
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            c[i][j]=a[i][j]+b[i][j];
        }
    }
    System.out.println("The addition of matrix is ");
    for(int i=0;i<rows;i++){
        for(int j=0;j<cols;j++){
            System.out.print(c[i][j]+" ");
        }
        System.out.println();
    }
    
    }
    
}