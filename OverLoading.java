class OverLoading{
    static int area(int a,int b){
        return a*b;
    }
    static float area(float a,float b){
        return a*b;
    }
     static double area(double a,double b){
        return a*b;
    }
    public static void main (String[] args) {
        OverLoading obj= new OverLoading();
        System.out.println("integer "+obj.area(2,3));
        System.out.println("float "+obj.area(2.080,3.948));
        System.out.println("double "+obj.area(2.3,3.8));
    }
}