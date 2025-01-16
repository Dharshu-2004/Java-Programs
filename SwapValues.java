public class SwapValues{
    public void withThirdvariables(){
        int mySalary=20000;
        int managersalary = 40000;
        System.out.println("Before Swapping");
        System.out.println("My Salary: "+mySalary+ " Manager Salary:" + managersalary);
        int temp=mySalary;
        mySalary=managersalary;
        managersalary=temp;
        System.out.println("After Swapping");
        System.out.println("My Salary: "+mySalary+ " Manager Salary:" + managersalary);
    }
    public void withoutThirdvariables(){
        int mySalary=20000;
        int managersalary = 40000;
        System.out.println("Before Swapping");
        System.out.println("My Salary: "+mySalary+ " Manager Salary:" + managersalary);
        mySalary= mySalary - managersalary;
        managersalary= mySalary+ managersalary;
        mySalary=managersalary - mySalary;
        
        System.out.println("After Swapping");
        System.out.println("My Salary: "+mySalary+ " Manager Salary:" + managersalary);
    }
    public static void main (String[] args) {
        SwapValues swap = new SwapValues();
        swap.withThirdvariables();
        swap.withoutThirdvariables();
    }
}