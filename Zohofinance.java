import java.util.*;
public class Zohofinance{
    public static void main (String[] args) {
        String s= "Zohofinanaces";
        if(s.length() % 2!=0){
            for(int i=0;i<s.length();i++){
                for(int j=0;j<s.length();j++){
                    if(i==j || i+j==s.length()-1){
                        System.out.print(s.charAt(j)+" ");
                    }
                    else{
                        System.out.print("  ");
                    }
                }System.out.println();
            }
        }
    }
}