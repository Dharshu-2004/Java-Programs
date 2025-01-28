class Beta1{
    int a=89;
    int b=10;
    void function(){
        System.out.println("Function called with super keywords");
    }
}
public class Superkeywords extends Beta1{
    void functions(){
        System.out.println("the value of a is "+super.a);
        System.out.println("the value of b is "+super.b);
        super.function();
    }
    public static void main (String[] args) {
        Superkeywords obj= new Superkeywords();
        obj.functions();
        
    }
}