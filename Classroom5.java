public class Classroom5 {

    // Trie Node
    static class Node {
        Node[] children = new Node[26];
        boolean eow; // end of word
    }

    // Root of Trie
    static Node root = new Node();

    // Insert a word into Trie
    public static void insert(String word) {
        Node curr = root;

        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';

            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    

    // Driver code
    public static void main(String[] args) {
        String[] words = {"the", "a", "there", "their", "any"};

        for (String word : words) {
            insert(word);
        }
    }
}

