import java.util.*;
public class InsertLinkedlist{
    Node head;
    static class Node{
        int data;
        Node next;
         Node(int data){
             this.data=data;
             this.next=null;
         }
    }
    public static InsertLinkedlist insertAtEnd(InsertLinkedlist list,int data){
        Node new_node= new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        else{
            Node last=list.head;
            while(last.next!=null){
                last=last.next;
            }
            last.next=new_node;
        }
        return list;
    }
    public static InsertLinkedlist insertAtBegin(InsertLinkedlist list,int data){
        Node new_node= new Node(data);
        if(list.head==null){
            list.head=new_node;
        }
        else{
           new_node.next=list.head;
           list.head=new_node;
        }
        return list;
    }
    public static InsertLinkedlist insertAtPosition(InsertLinkedlist list,int data,int index){
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
    public static void printlist(InsertLinkedlist list){
        Node curr_node=list.head;
        while(curr_node!=null){
            System.out.print(curr_node.data+" ");
            curr_node=curr_node.next;
        }
    }
    public static void main (String[] args) {
        InsertLinkedlist list = new InsertLinkedlist();
        list=insertAtEnd(list,5);
        list=insertAtEnd(list,6);
        list=insertAtEnd(list,7);
        list=insertAtBegin(list,4);
        list=insertAtPosition(list,3,1);
        printlist(list);
    }
}
