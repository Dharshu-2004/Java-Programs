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
class child2 extends parent{
    static void foodss(){
        System.out.println("burger");
    }
}
class heirarchialInheritance extends child2{
    public static void main (String[] args) {
        heirarchialInheritance c =new heirarchialInheritance();
        c.foodss();
        c.food();
        child1 cc= new child1();
        cc.foods();
    }
}