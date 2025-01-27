class parent{
    static void food(){
        System.out.println("Idli");
    }
}
class SingleInheritance extends parent{
    public static void main (String[] args) {
        child1 c=new child1();
        c.food();
    }
}