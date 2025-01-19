import java.util.Scanner;
public class SnakeMatrix{
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        int rows=3;int cols=3;
        System.out.println("Enter the elements for the 3X3 matris:");
        int[][] mat=new int[rows][cols];
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        System.out.println("Original Matrix:");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println("Snake Pattern of Matrix is; ");
        for(int i=0;i<mat.length;i++){
            if(i%2==0){
                for(int j=0;j<mat[0].length;j++){
                    System.out.print(mat[i][j]+" ");
                }
            }
            else{
                for(int j=mat[0].length-1;j>=0;j--){
                    System.out.print(mat[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}