import java.util.*;
public class DeleteLinkedlist{
    Node head;
    static class Node{
        int data;
        Node next;
         Node(int data){
             this.data=data;
             this.next=null;
         }
    }
    public static DeleteLinkedlist insertAtEnd(DeleteLinkedlist list, int data){
        Node new_node = new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        else{
            Node temp=list.head;
            while(temp.next!=null){
                temp=temp.next;
            }              
            temp.next=new_node;
        }return list;
    }
    public static DeleteLinkedlist deletetAtEnd(DeleteLinkedlist list){
       
        if(list.head==null){
            System.out.println("Linked list is empty.");
        }
        else{
            Node temp = list.head;
            Node prev= list.head;
            while(temp.next!=null){
                prev=temp;
                temp=temp.next;
            }
            prev.next=null;
        }
        return list;
    }
    public static DeleteLinkedlist deleteAtBegin(DeleteLinkedlist list){
       
        if(list.head==null){
            System.out.println("Linked list is empty.");
        }
        else{
          list.head=list.head.next;
        }
        return list;
    }
    public static DeleteLinkedlist deleteAtPosition(DeleteLinkedlist list,int index){
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
    public static void printlist(DeleteLinkedlist list){
        Node curr_node=list.head;
        while(curr_node!=null){
            System.out.print(curr_node.data+" ");
            curr_node=curr_node.next;
        }
    }
    public static void main (String[] args) {
        DeleteLinkedlist list = new DeleteLinkedlist();
        list=insertAtEnd(list,4);
        list=insertAtEnd(list,5);
        list=insertAtEnd(list,6);
        list=insertAtEnd(list,7);
        list=deleteAtPosition(list,1);
        printlist(list);
    }
}
