public class class1 {
    // node class must be static so that it can be accessed inside the binaryTree class.
    static class Node{
        int data;
        Node left;
        Node right;
        // constructor
        Node(int data){
            this.data = data;
            this.left=null;
            this.right=null;
        }
    }
    // binary tree class must be static 
    static class binaryTree{
        static int idx=-1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(idx>=nodes.length || nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }

    // main
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binaryTree.idx=-1;   // Reset idx before building a new tree
        Node root = binaryTree.buildTree(nodes);
        System.out.println("Root of the tree is "+root.data);
    }
    
}
