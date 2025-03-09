
import java.util.*;
public class sumOfNodes {
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

    public static int sumOfNodes(Node root){
        if(root == null) return 0;
        int leftSum = sumOfNodes(root.left);
        int rightSum = sumOfNodes(root.right);
        return leftSum+rightSum+root.data;
    }
   
    
    
    // main
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binartTree.idx=-1;
        Node root = binartTree.buidlTree(nodes); // first we build the tree

        // calling numOfNodes  for above tree
        int sum = sumOfNodes(root);// pass the root
        System.out.println("Total nodes sum is "+sum);
        
       
    }
}
