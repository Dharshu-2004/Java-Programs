public class CircularSinglyInsert {
    Node head;
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static CircularSinglyInsert insertBegin(CircularSinglyInsert list, int data) {
        Node new_node = new Node(data);
        if (list.head == null) {
            list.head = new_node;
            new_node.next = new_node;
        } else {
            Node temp = list.head;
            while (temp.next != list.head) {
                temp = temp.next;
            }
            new_node.next = list.head;
            temp.next = new_node;
            list.head = new_node; 
        }
        return list;
    }
    public static CircularSinglyInsert insertAtPosition(CircularSinglyInsert list,int data,int index){
        Node new_node= new Node(data);
        if(index==1){
            new_node.next=list.head;
            list.head=new_node;
        }
        else{
            Node temp=list.head;
            while(index-1>1){
                temp=temp.next;
                index=index-1;
            }
            new_node.next=temp.next;
            temp.next=new_node;
            
        }
        return list;
    }
    public static CircularSinglyInsert insert(CircularSinglyInsert list, int data) {
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

    public static void printlist(CircularSinglyInsert list) {
        if (list.head != null) {
            Node curr_node = list.head;
            do {
                System.out.print(curr_node.data + " ");
                curr_node = curr_node.next; 
            } while (curr_node != list.head);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularSinglyInsert list = new CircularSinglyInsert();
        list = insert(list, 8);
        list = insert(list, 7);
        list = insertBegin(list, 9);
        list = insertAtPosition(list,2,2);
        printlist(list); 
    }
}
