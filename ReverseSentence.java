import java.util.Scanner;
public class ReverseSentence{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Sentences: ");
        String sentence=sc.nextLine();
        String[] arr=sentence.split(" ");
        System.out.println(arr.length);
        String reversed="";
        for(int i = arr.length-1;i>=0;i--){
            reversed=reversed+" "+arr[i];
        }
        System.out.println("The reversed Sentences is: "+reversed);
    }
}