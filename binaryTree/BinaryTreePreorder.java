package binaryTree;

import java.util.Queue;
import java.util.LinkedList;

public class BinaryTreePreorder {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;

        // Building the tree using the given nodes in preorder
        public Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        // Function for traversing the tree elements in preorder
        public void preorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            System.out.print(root.data + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);

        }

        // Function for traversing the tree elements in inorder
        public void inorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            inorderTraversal(root.left);
            System.out.print(root.data + " ");
            inorderTraversal(root.right);

        }

        // Function for traversing the tree elements in postorder
        public void postorderTraversal(Node root) {
            if (root == null) {
                return;
            }
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        // Function for treaversing the tree elements in level order traversal
        public void leverorderTraversal(Node root) {
            if (root == null) {
                return;
            }

            Queue<Node> que = new LinkedList<>();
            que.add(root);
            que.add(null);
            while (!que.isEmpty()) {
                Node currNode = que.remove();
                if (currNode == null) {
                    System.out.println();
                    if (que.isEmpty()) {
                        break;
                    } else {
                        que.add(null);
                    }
                } else {
                    System.out.print(currNode.data + " ");
                    if (currNode.left != null) {
                        que.add(currNode.left);
                    }
                    if (currNode.right != null) {
                        que.add(currNode.right);
                    }
                }

            }
        }
    }

    public static void main(String[] args) {
        // Nodes in preorder sequence
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };

        BinaryTree bt = new BinaryTree();
        Node root = bt.buildTree(nodes);

        // Printing the data on the root node after the building the tree
        System.out.println("Head Node Data: " + root.data);

        // Traversing the tree in preorder
        System.out.print("Printing the tree in preorder traversal : ");
        bt.preorderTraversal(root);
        System.out.println();

        // Traversing the tree in inorder traversal
        System.out.print("Printing the tree in inorder traversal: ");
        bt.inorderTraversal(root);
        System.out.println();

        // Traversing the tree in postorder traversal
        System.out.print("Printing the tree in postorder traversal: ");
        bt.postorderTraversal(root);
        System.out.println();

        // Traversing the tree in levelorder Traversal (BFS)
        System.out.println("Printing the tree in levelorder traversal: ");
        bt.leverorderTraversal(root);

    }
}
