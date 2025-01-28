import java.util.*;
public class QueueUsingArray {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue obj=new Queue();
		System.out.println("Press 1 to add element\nPress 2 to remove element\nPress 3 to view the Queue\nPress 4 to exit");
		while(true) {
		    
			int input = sc.nextInt();
			switch(input) {
			case 1: {
			    System.out.println("Enter the element to be added: ");
				int data =sc.nextInt();
				obj.enqueue(data);
				break;
			}
			case 2: {
				obj.dequeue();
				break;
			}
			case 3: {
				obj.display();
				break;
			}
			case 4:{
			    return;
			}
			default: {
				System.out.println("Enter valid input");
				break;
			}
			}
		}
	}
}
class Queue {
	int top=0;
	int n=5;
	int[] arr=new int[5];
	public void enqueue(int data) {
		if(top==n-1) {
			System.out.println("Queue Overflow");
		}
		else {
			arr[top++]=data;
		}
	}
	public void dequeue() {
		if(top==0) {
			System.out.println("Queue Underflow");
		}
		else {
			System.out.println("Popped Element: "+arr[0]);
			for(int i=0;i<arr.length-1;i++){
			    arr[i]=arr[i+1];
			}
			arr[top--]=0;
			

		}
	}
	public void display() {
		if(top==0) {
			System.out.println("Queue Underflow");
		}
		else {
			for(int i=0; i<arr.length; i++) {
				System.out.println(arr[i]+" ");
			}
		}
	}
}
