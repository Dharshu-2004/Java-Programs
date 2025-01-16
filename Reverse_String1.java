import java.util.*;
public class Reverse_String1{
    public static void main(String[] args){
       String given="Hello";
       char[] chararray = given.toCharArray();
       String reverse_string="";
       for(int i = chararray.length-1;i>=0; i--){
           reverse_string=reverse_string+chararray[i];
       }
       System.out.println(reverse_string);
    }
}