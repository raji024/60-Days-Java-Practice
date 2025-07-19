package tree;

import java.util.*;

// Node class for binary tree
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

// Binary Tree class with build and utility methods
class BT {
    int idx = -1;

    // Build binary tree from preorder array with -1 as null
    public Node buildTree(int[] nodes) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }

    // Preorder traversal
    public void preorder(Node root) {
        if (root == null) return;

        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    // Height of tree
    public int height(Node node) {
        if (node == null) return 0;
        int left = height(node.left);
        int right = height(node.right);
        return Math.max(left, right) + 1;
    }

    // Size of tree (number of nodes)
    public int size(Node node) {
        if (node == null) return 0;
        int left = size(node.left);
        int right = size(node.right);
        return left + right + 1;
    }

    // Sum of all nodes in tree
    public int sum(Node node) {
        if (node == null) return 0;
        int left = sum(node.left);
        int right = sum(node.right);
        return left + right + node.data;
    }
}

// Main class
public class tree_impli2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of nodes in preorder array (including -1 for nulls): ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter node values separated by spaces (use -1 for null):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        BT tree = new BT();
        Node root = tree.buildTree(arr);

        System.out.println("\nPreorder Traversal of the constructed tree:");
        tree.preorder(root);

        System.out.println("\nHeight of tree: " + tree.height(root));
        System.out.println("Size of tree: " + tree.size(root));
        System.out.println("Sum of all nodes: " + tree.sum(root));

        sc.close();
    }
}

