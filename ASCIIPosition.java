import java.util.Scanner;

public class ASCIIPosition {
    public void Lowercase(char ch) {
        ch = Character.toLowerCase(ch); 
        int value = (int) ch;           
        int position = value - 96;      
        System.out.println("Position in lowercase alphabet: " + position);
    }

    public void Uppercase(char ch) {
        ch = Character.toUpperCase(ch); 
        int value = (int) ch;          
        int position = value - 64;      
        System.out.println("Position in uppercase alphabet: " + position);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ASCIIPosition asciiPos = new ASCIIPosition(); 

        System.out.println("Enter a single character:");
        char ch = sc.next().charAt(0); 

        System.out.println("If you want to find the position of uppercase, enter 1");
        System.out.println("If you want to find the position of lowercase, enter 0");
        int n = sc.nextInt();

        if (n == 1) {
            asciiPos.Uppercase(ch); 
        } else {
            asciiPos.Lowercase(ch); 
        }

        sc.close(); 
    }
}
