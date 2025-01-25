import java.util.*;
public class PrintNumbersWithoutLoop{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n= sc.nextInt();
        printNumbers(n);
    }
    static void printNumbers(int n){
        if(n>0){
            printNumbers(n-1);
            System.out.print(n+" ");
        }
    }
}