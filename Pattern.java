import java.util.*;
public class Pattern{
            public void Aletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||i==n/2||j==0||j==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Bletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||i==n/2||j==0||j==n-1||i==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Cletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||j==0||i==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Dletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||j==2||i==n-1||j==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Eletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||j==0||i==n-1||i==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
         public void Fletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||j==0||i==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Sletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||i==n-1||i==n/2||i<n/2 && j==0||i>n/2 && j==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Gletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||i==n-1||i>n/2 && j==n-1||j==0||i==n/2&& j>=n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Hletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1||i==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Iletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||i==n-1||j==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Jletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i==0||i==n-1 && j<n/2||j==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Kletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(j==0||i+j==n/2||i-j==n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Xletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i+j==n-1||i==j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Zletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(i+j==n-1||i==0||i==n-1){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Vletter(int n){
            for(int i=n-1;i>=0;i--)
            {
                for(int j=0;j<n;j++){
                    if(i+j==n-1 && j<=n/2||i==j && j>=n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Wletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1||i+j==n-1 && j<n/2||i==j && j>=n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Mletter(int n){
            for(int i=n-1;i>=0;i--)
            {
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1||i+j==n-1 && j<n/2||i==j && j>=n/2){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }
        public void Nletter(int n){
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++){
                    if(j==0||j==n-1||i==j){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
        }


    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Pattern p=new Pattern();
        p.Aletter(n);
        System.out.println();
        p.Bletter(n);
        System.out.println();
        p.Cletter(n);
        System.out.println();
        p.Dletter(n);
        System.out.println();
        p.Eletter(n);
        System.out.println();
        p.Fletter(n);
        System.out.println();
        p.Sletter(n);
        System.out.println();
        p.Gletter(n);
        System.out.println();
        p.Hletter(n);
        System.out.println();
        p.Iletter(n);
        System.out.println();
        p.Jletter(n);
        System.out.println();
        p.Kletter(n);
        System.out.println();
        p.Xletter(n);
        System.out.println();
        p.Zletter(n);
        System.out.println();
        p.Vletter(n);
        System.out.println();
        p.Wletter(n);
        System.out.println();
        p.Mletter(n);
        System.out.println();
        p.Nletter(n);
        System.out.println();
    
    }
}