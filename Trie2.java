class Trie2 {
    // Trie Node
    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord = false;
    }
    private static Node root = new Node();
    // Insert a word
    public static void insert(String word) {
        word = word.toLowerCase(); // FIX 1

        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            // FIX 2: validate character
            if (ch < 'a' || ch > 'z') continue;

            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.endOfWord = true;
    }
    // Search a word
    public static boolean search(String word) {
        word = word.toLowerCase();
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (ch < 'a' || ch > 'z') return false;

            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.endOfWord;
    }
    public static boolean startsWith(String prefix) {
        prefix = prefix.toLowerCase();
        Node curr = root;
        for (int i = 0; i < prefix.length(); i++) {
            char ch = prefix.charAt(i);
            if (ch < 'a' || ch > 'z') return false;
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
}
