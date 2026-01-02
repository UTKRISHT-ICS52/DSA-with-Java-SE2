public class DeleteBST {

    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = right = null;
        }
    }

    public static Node deleteNode(Node root, int key) {
        if (root == null) {
            return null;
        }

        // Search the node
        if (key < root.data) {
            root.left = deleteNode(root.left, key);
        } 
        else if (key > root.data) {
            root.right = deleteNode(root.right, key);
        } 
        else {
            // Case 1: No child
            if (root.left == null && root.right == null) {
                return null;
            }

            // Case 2: One child
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }

            // Case 3: Two children
            Node inorderSuccessor = findMin(root.right);
            root.data = inorderSuccessor.data;
            root.right = deleteNode(root.right, inorderSuccessor.data);
        }

        return root;
    }

    // Find minimum value node (Inorder Successor)
    public static Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }

    // Inorder traversal
    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int[] values = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int val : values) {
            root = insert(root, val);
        }

        System.out.print("Before Deletion: ");
        inorder(root);

        root = deleteNode(root, 3);

        System.out.print("\nAfter Deletion: ");
        inorder(root);
    }

    // Insert for building BST
    public static Node insert(Node root, int val) {
        if (root == null) return new Node(val);

        if (val < root.data)
            root.left = insert(root.left, val);
        else
            root.right = insert(root.right, val);

        return root;
    }
}
