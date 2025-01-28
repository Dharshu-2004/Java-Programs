import java.util.*;
public class StackUsingArray {
	public static void main (String[] args) {
		Scanner sc= new Scanner(System.in);
		Stack obj=new Stack();
		System.out.println("Press 1 for append values\nPress 2 for Pop Values\nPress 3 for display values\nPress 4 to exit");
	 while(true){
	    
	    int input=sc.nextInt();
	    switch(input){
	        case 1:{
	            System.out.print("Enter the element to be entered:");
	            int data =sc.nextInt();
	            obj.push(data);
	            break;
	            
	        }
	        case 2:{
	            obj.pop();
	            break;
	        }
	        case 3:{
	            System.out.println("Stack :");
	            obj.display();
	            break;
	        }
	        case 4:{
	            return;
	           
	        }
	        default:{
	            System.out.println("Enter the valid input");
	        }
	    }
	   }	

	}
}
class Stack {
	int top=-1;

	int n=3;
	int[] arr=new int[n];

	public void push(int data) {
	    
	    if(top==n-1){
	        System.out.println("Stack Overflow");
	    }
		top++;
		arr[top]=data;
		
	}
	public void pop() {
	    
		if(top==-1) {
			System.out.println("Stack Underflow");
		} else {
			System.out.println("Popped element: "+arr[top]);
			arr[top]=0;
			top--;
		}
	}
	public void display() {
		if(top==-1)
		{
			System.out.println("Stack Underflow");

		} else {
			for(int i=arr.length-1; i>=0; i--) {
				System.out.println(arr[i]+" ");
			}
		}
	}
}