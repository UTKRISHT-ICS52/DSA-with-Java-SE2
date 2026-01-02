// count of nodes in a binary trees 

public class BinaryTreesYT4 {
    static class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    static class BinaryTree {
        static int idx = -1;

        public static Node buildTree(int[] nodes) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }

            Node root = new Node(nodes[idx]);
            root.left = buildTree(nodes);
            root.right = buildTree(nodes);
            return root;
        }
    }
    // count nodes 
    public static int countNodes(Node root) {
        if (root == null) {
            return 0;
        }
        int leftCount = countNodes(root.left);
        int rightCount = countNodes(root.right);
        return leftCount + rightCount + 1;
    }
    // main function 
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree.idx = -1;   // reset index
        Node root = BinaryTree.buildTree(nodes);

        int totalNodes = countNodes(root);
        System.out.println("Total number of nodes: " + totalNodes);
    }
}

   
  

