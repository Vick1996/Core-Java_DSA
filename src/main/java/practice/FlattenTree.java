package practice;


import java.util.Scanner;

// Node class to represent each node in the binary tree
class TreeNode {
    int data;
    TreeNode left, right;

    TreeNode() {}

    TreeNode(int data) {
        this.data = data;
        left = right = null;
    }
}

// BinarySearchTree class to manage the binary tree operations
class BinarySearchTree {
    TreeNode root;

    TreeNode ans;
    BinarySearchTree() {
        root = null;
    }

    // Method to insert a node into the tree
    void insert(int data) {
        root = insertRecursive(root, data);
    }

    // Recursive method to insert a node into the tree
    TreeNode insertRecursive(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data) {
            root.left = insertRecursive(root.left, data);
        } else if (data > root.data) {
            root.right = insertRecursive(root.right, data);
        }

        return root;
    }

    // Method to perform inorder traversal of the tree
    void display(TreeNode root) {
        if (root != null) {
            display(root.left);
            display(root.right);
            System.out.print(root.data + " ");

        }
    }

    void flattenHelper(TreeNode root)
    {
        if(root == null)
            return;

        ans.data = root.data;

        if(root.left !=null)
        {
            ans.right = new TreeNode();
            ans.left = null;
            ans = ans.right;
            flattenHelper(root.left);
        }

        if(root.right!=null)
        {
            ans.right = new TreeNode();
            ans.left = null;
            ans = ans.right;
            flattenHelper(root.right);
        }
    }
    void flatten(TreeNode root)
    {
        if(root == null) return;

        ans = new TreeNode(root.data);
        TreeNode ans1 = ans;

        flattenHelper(root);

        root.left = null;
        root.right = ans1.right;
    }
}

// Main class to run the menu-driven program
public class FlattenTree
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BinarySearchTree bst = new BinarySearchTree();

        int choice;
        do {
            System.out.println("---------------Menu---------------");
            System.out.println("1. Insert Node");
            System.out.println("2. Display tree");
            System.out.println("3. Flatten tree");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter data for the new node: ");
                    int data = scanner.nextInt();
                    bst.insert(data);
                    System.out.println("Node inserted successfully!\n\n");
                }
                case 2 -> {
                    System.out.println("Traversal:");
                    bst.display(bst.root);
                    System.out.println();
                }
                case 3 -> {
                    bst.flatten(bst.root);
                    bst.display(bst.root);
                    System.out.println();
                }
                case 4 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid choice! Please enter again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
