package tree;
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
class Bt{
    int idx =-1;
    Node root;
    Node buildTree(int[] nodes){
        idx++;
        if(idx >= nodes.length || nodes[idx]== -1){
           return null;
        }
        Node newNode = new Node(nodes[idx]);
        if(root == null){
            root = newNode;
        }
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);

        return newNode;

    }
    void preorder(Node node){
        if(node == null){
            return;
        }
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
    }
}
public class tree_impli {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n =sc.nextInt();
      int nodes[] = new int[n];
      for(int i=0;i<n;i++){
        nodes[i] = sc.nextInt();
      }
      Bt tree = new Bt();
      tree.preorder(tree.root);

    }
}
