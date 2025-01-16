import java.util.Scanner;
public class LengthString {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String: ");
		String string=sc.next();
		char[] ch = string.toCharArray();
		int count=0;
		for(int i=0; i<ch.length; i++) {
			count+=1;

		}
		System.out.println("The length of the String is: "+count);
	}
}