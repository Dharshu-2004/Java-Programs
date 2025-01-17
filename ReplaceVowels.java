import java.util.Scanner;
public class ReplaceVowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the string");
        String str = sc.next();
        char[] s = str.toCharArray();
        
        System.out.println("Enter the special character: ");
        char c=sc.next().charAt(0);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A' || str.charAt(i)=='E'|| str.charAt(i)=='I'|| str.charAt(i)=='O'|| str.charAt(i)=='U' || str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'||str.charAt(i)=='u'){
                s[i]=c;
            }
        }
        System.out.println("After replacement: ");
        for(int i=0; i<str.length();i++){
            System.out.print(s[i]);
        }
    }
}