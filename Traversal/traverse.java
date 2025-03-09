
public class traverse {
    // Node static class
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){ // Constructor
            this.data=data;
            this.left =null;
            this.right=null;
        }
    }
    //Binary tree
    static class binartTree{
        static int idx=-1;
        public static Node buidlTree(int[] nodes){
            idx++;
            if(idx>=nodes.length||nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buidlTree(nodes);
            newNode.right = buidlTree(nodes);
            return newNode;// return the root node
        }
    }
    
    // preOrder Traversal 
    public static void preOrder(Node root){
        if(root ==null) return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);

    }
    
    // Inorder Traversal
    public static void inOrder(Node root){
        if(root==null) return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    //PostOrder traversal
    public static void postOrder(Node root){
        if(root==null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }

    // main
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binartTree.idx=-1;
        Node root = binartTree.buidlTree(nodes); // first we build the tree
        // now below is the functon of the traversal method
    
        // 1. preOrder--> // -- 1.Root 2.left child 3.right child
        System.out.println("Pre-Order Traverssal we get :");
        preOrder(root);
        System.out.println();
        
        // 2. Inorder traversal --> 1.left 2.root 3.right
        System.out.println("Inorder traversal we get: ");
        inOrder(root);
        System.out.println();

        // 2. Inorder traversal --> 1.left 2.right 3.root
        System.out.println("Post Order traversal we get: ");
        postOrder(root);
    }
}
