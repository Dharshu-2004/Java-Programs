class Node {
    int key;
    Node left, right;
    public Node(int item)
    {
        key=item;
        left=right = null;
    }
}
class BinarySearchTree {
    static Node insertBST(Node node, int key)
    {
         if (node== null)
            return new Node(key);
         if (node.key == key)
            return node;
         if (key < node.key)
            node.left = insertBST(node.left, key);
        else
            node.right = insertBST(node.right, key);

        return node;
    }


static void inorder(Node node)
    {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }
    static void preorder(Node node)
    {
        if (node != null) {
            System.out.print(node.key + " ");
            inorder(node.left);
            
            inorder(node.right);
        }
    }
    static void postorder(Node node)
    {
        if (node != null) {
            
            inorder(node.left);
            
            inorder(node.right);
            System.out.print(node.key + " ");
        }
    }

    public static void main(String[] args)
    {
        Node node = null;

        node = insertBST(node, 58);
        node = insertBST(node, 67);
        node = insertBST(node, 13);
        node = insertBST(node, 42);
        node = insertBST(node, 28);
        node = insertBST(node, 46);
        node = insertBST(node, 78);
        node = insertBST(node, 63);
        node = insertBST(node, 12);
        node = insertBST(node, 32);
       System.out.println("Inorder");
       inorder(node);
       System.out.println();
        System.out.println("preorder");
       preorder(node);
       System.out.println();
        System.out.println("Postorder");
       postorder(node);
    }
}
