public class main3 {
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
    }
    static TrieNode root = new TrieNode();
    static void insert(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
    }
    static int countNodes(TrieNode node) {
        int count = 0;
        for (int i = 0; i < 26; i++) {
            if (node.children[i] != null) {
                count += countNodes(node.children[i]);
            }
        }
        return count + 1; 
    }

    public static void main(String[] args) {
        String s = "ababa";
        // Insert all suffixes
        for (int i = 0; i < s.length(); i++) {
            insert(s.substring(i));
        }
        int totalNodes = countNodes(root);
        System.out.println("Unique Substrings = " + (totalNodes - 1));
    }
}

