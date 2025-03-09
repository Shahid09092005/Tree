
import java.util.*;
public class levelOrderTraversal {
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

    // level order traversal
    public static void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(!q.isEmpty()){
            Node currNode = q.remove();
            if(currNode!=null){
                System.out.print(currNode.data+" ");
                if(currNode.left!=null){
                    q.add(currNode.left);
                }
                if(currNode.right!=null){
                    q.add(currNode.right);
                }
            }else{ // node is null
                System.out.println();
                if(!q.isEmpty()){
                    q.add(null);
                }
            }
        }
        
    }
    
    
    // main
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        binartTree.idx=-1;
        Node root = binartTree.buidlTree(nodes); // first we build the tree

        // now below is the functon of level ordertraversal method
        BFS(root);

       
    }
}
