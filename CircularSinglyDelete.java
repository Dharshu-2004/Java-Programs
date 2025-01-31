public class CircularSinglyDelete {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static CircularSinglyDelete deleteBegin(CircularSinglyDelete list) {
        
        if (list.head == null) {
            System.out.println("No elements in the list");
        } else {
            Node temp = list.head;
            while (temp.next != list.head) {
                temp = temp.next;
            }
           temp.next=list.head.next;
           list.head.next=null;list.head=temp.next;
        }
        return list;
    }
    public static CircularSinglyDelete deleteEnd(CircularSinglyDelete list) {
        
        if (list.head == null) {
            System.out.println("No elements in the list");
        } else {
            Node temp = list.head;
            while (temp.next.next != list.head) {
                temp = temp.next;
            }
           temp.next=list.head;
        }
        return list;
    }
    public static CircularSinglyDelete deletePos(CircularSinglyDelete list,int index) {
       if(list.head==null){
            System.out.println("Linked List is empty");
        }
        else if(index==1){
            list.head=list.head.next;
        }
        else{
            Node temp=list.head;
            Node prev=list.head;
            while(index-1>0){
                prev=temp;
                temp=temp.next;
                index=index-1;
            }
            prev.next=temp.next;
            temp.next=null;
            
        }
        return list;
    }
    
    public static CircularSinglyDelete insert(CircularSinglyDelete list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
            new_node.next = new_node;
        } else {
            Node temp = list.head;
            while (temp.next != list.head) {
                temp = temp.next;
            }
            temp.next = new_node;
            new_node.next = list.head;
        }
        return list;
    }

    public static void printlist(CircularSinglyDelete list) {
        Node c=list.head;
        while(c.next!=list.head){
            System.out.print(c.data+" ");
            c=c.next;
        }
        System.out.print(c.data+" ");
    }

    public static void main(String[] args) {
        CircularSinglyDelete list = new CircularSinglyDelete();
        list = insert(list, 6);
        list = insert(list, 5);
        list = insert(list, 8);
        list = insert(list, 7);
        list = insert(list,9);
        list = insert(list, 10);
        list = deletePos(list,3 );
        list= deleteEnd(list);
        list = deleteBegin(list);
        printlist(list); 
    }
}
