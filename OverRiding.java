class A {
	 void function1() {
		System.out.println("The function is in class A");
	}
}
class B extends A{
	 void function1() {
		System.out.println("The function is in class B");
	}
}
class C extends B{
      void function1() {
		System.out.println("The function is in class C");
	}
}
public class OverRiding{
    public static void main (String[] args) {
        A obj = new B();
        obj.function1();
        
    }
}