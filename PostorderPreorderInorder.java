import java.util.*;
public class Tree{
    int data;
    Tree left,right;
    Tree(int d){
        data=d;
        left=right=null;
    }
    static void Preorder(Tree node){
        if(node==null){
            return;
        }
       
        System.out.print(node.data+" ");
        Preorder(node.left);
        Preorder(node.right);
        
    }
    static void Postorder(Tree node){
        if(node==null){
            return;
        }
       Postorder(node.left);
       Postorder(node.right);
        System.out.print(node.data+" ");
      
    }
    static void Inorder(Tree node){
        if(node==null){
            return;
        }
       Inorder(node.left);
       System.out.print(node.data+" ");
        Inorder(node.right);
        
    }
        public static void main(String[] args) {
        Tree root = new Tree(2);
        root.left = new Tree(3);
        root.right = new Tree(4);
        root.left.left = new Tree(5);
        root.left.right = new Tree(7);
        root.right.left=new Tree(10);
        root.right.right=new Tree(11);
        root.left.left.right = new Tree(6);
        root.left.right.left = new Tree(9);
        root.left.right.right = new Tree(8);
        System.out.println("Preorder");
        Preorder(root);
        System.out.println();
        System.out.println("Postorder");
        Postorder(root);
        System.out.println();
        System.out.println("Inorder");
        Inorder(root);
    }
    }
