import java.util.Scanner;

public class AccentureBox {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = "Accenturelllll";
        int n = s.length();

        char[] c = s.toCharArray();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               
                if (i == 0) { 
                    System.out.print(c[j] + " ");
                } else if (i == n - 1) { 
                    System.out.print(c[n - j - 1] + " ");
                } else if (j == 0) { 
                    System.out.print(c[i] + " ");
                } else if (j == n - 1) { 
                    System.out.print(c[n - i - 1] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        scanner.close();
    }
}
