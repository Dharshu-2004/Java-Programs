class parent{
    static void food(){
        System.out.println("Idli");
    }
}
class child1 extends parent{
    static void foods(){
        System.out.println("pizza");
    }
}
class multipleInheritance extends parent{
    public static void main (String[] args) {
        child1 c=new child1();
        c.food();
        c.foods();
    }
}