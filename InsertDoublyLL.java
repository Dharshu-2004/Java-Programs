import java.util.*;
public class InsertDoublyLL{
    Node head;
    static class Node{
        int data;
        Node next;
        Node prev;
         Node(int data){
             this.data=data;
             this.next=null;
             this.prev=null;
         }
    }
    public static InsertDoublyLL insertAtEnd(InsertDoublyLL list, int data){
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
            new_node.prev=temp.next;
        }return list;
    }
   public static InsertDoublyLL insertAtBegin(InsertDoublyLL list,int data){
       Node new_node = new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        else{
           list.head.prev=new_node;
           new_node.next=list.head;
           list.head=new_node;
        }
        return list;
    }
    public static InsertDoublyLL insertAtPos(InsertDoublyLL list,int data,int p){
       Node new_node = new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        else{
            Node temp=list.head;
            Node previous=list.head;
            while(p-1>=1){
                previous=temp;
                temp=temp.next;
                p--;
            }
           new_node.prev=temp;
           temp.next.prev=new_node;
           new_node.next=temp.next;
           temp.next=new_node;
            
            
        }return list;
       
    }
    public static void printlist(InsertDoublyLL list){
        Node curr_node=list.head;
        while(curr_node!=null){
            System.out.print(curr_node.data+" ");
            curr_node=curr_node.next;
        }
    }
    public static void main (String[] args) {
        InsertDoublyLL list = new InsertDoublyLL();
        list=insertAtEnd(list,4);
        list=insertAtEnd(list,5);
        list=insertAtEnd(list,6);
        list=insertAtEnd(list,7);
        list=insertAtBegin(list,3);
        list=insertAtPos(list,8,3);
        printlist(list);
    }
}
