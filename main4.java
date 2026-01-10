public class main4 {

    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        boolean isEnd = false;
    }
    static class Trie {
        TrieNode root = new TrieNode();
        void insert(String word) {
            TrieNode curr = root;
            for (char ch : word.toCharArray()) {
                int idx = ch - 'a';
                if (curr.children[idx] == null) {
                    curr.children[idx] = new TrieNode();
                }
                curr = curr.children[idx];
            }
            curr.isEnd = true;
        }
        boolean allPrefixesExist(String word) {
            TrieNode curr = root;
            for (char ch : word.toCharArray()) {
                int idx = ch - 'a';
                curr = curr.children[idx];
                if (curr == null || !curr.isEnd) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void main(String[] args) {
        String[] words = {
            "a", "ap", "app", "appl", "apple", "apply"
        };
        Trie trie = new Trie();
        for (String word : words) {
            trie.insert(word);
        }
        String ans = "";

        for (String word : words) {
            if (trie.allPrefixesExist(word)) {
                if (word.length() > ans.length() ||
                   (word.length() == ans.length() && word.compareTo(ans) < 0)) {
                    ans = word;
                }
            }
        }

        System.out.println("Answer = " + ans);
    }
}

