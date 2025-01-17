import java.util.Scanner;
public class VowelsOccurence{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str= sc.next();
        str=str.toLowerCase();
        char[] ch = str.toCharArray();
        int occurrence = 0;
        for(int i=0;i<str.length();i++){
           if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'){
               occurrence++;
           } 
        }
        System.out.println("The occurence of the vowel in the string is: "+occurrence);
    }
}