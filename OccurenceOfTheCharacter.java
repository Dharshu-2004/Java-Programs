//Find the occurrence of the character
import java.util.Scanner;
public class OccurenceOfTheCharacter{
    public void With_using_iteration(String str, char c){
        str = str.toLowerCase();
        c=Character.toLowerCase(c);
        System.out.println(c);
        int occurrence = 0;
        for(int i=0; i < str.length() ; i++){
            if(str.charAt(i)==c){
                occurrence++;
            }
        }
        System.out.println("The number of Occurence Of The Character "+c+" is "+ occurrence);
    }
    public void Without_using_iteration(String str, char c){
        str = str.toUpperCase();
        String ch =  Character.toString(c).toUpperCase();
        System.out.println("The length of the String is: "+str.length());
        String output = str.replace(ch,"");
        System.out.println("The length of the String is: "+output.length());
        int Occurence=str.length()-output.length();
        System.out.println("The number of Occurence Of The Character "+c+" is "+Occurence);
        
    }
    public static void main (String[] args) {
        Scanner sc= new Scanner(System.in);
        OccurenceOfTheCharacter oc=new OccurenceOfTheCharacter();
        System.out.println("Enter a String: ");
        String str = sc.next();
        System.out.println("Enter a character to be checked: ");
        char c = sc.next().charAt(0);
        oc.With_using_iteration(str,c);
        oc.Without_using_iteration(str,c);
    }
}