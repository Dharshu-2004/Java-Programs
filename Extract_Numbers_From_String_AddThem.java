import java.util.Scanner;
public class Extract_Numbers_From_String_AddThem{
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        char[] arr=str.toCharArray();
        int addition=0;
        for(int i=0;i<str.length();i++){
            if(arr[i]=='1'||arr[i]=='2'||arr[i]=='3'||arr[i]=='4'||arr[i]=='5'||arr[i]=='6'||arr[i]=='7'||arr[i]=='8'||arr[i]=='9'||arr[i]=='0'){
                int add=Character.getNumericValue(arr[i]);
                addition+=add;
            }
        }
        System.out.println("The sum of the numbers present in the String is "+addition);
    }
}