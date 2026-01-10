class TrieNode {
    TrieNode[] children;
    boolean isEnd;

    public TrieNode() {
        children = new TrieNode[26];
        isEnd = false;
    }
}

class Trie {
    TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word
    public void insert(String word) {
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

    // Search a complete word
    public boolean search(String word) {
        TrieNode curr = root;

        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null)
                return false;

            curr = curr.children[idx];
        }
        return curr.isEnd;
    }

    // Check prefix
    public boolean startsWith(String prefix) {
        TrieNode curr = root;

        for (char ch : prefix.toCharArray()) {
            int idx = ch - 'a';

            if (curr.children[idx] == null)
                return false;

            curr = curr.children[idx];
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {

        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("banana");
        trie.insert("bat");

        System.out.println(trie.search("app"));     // true
        System.out.println(trie.search("ap"));      // false
        System.out.println(trie.startsWith("ap"));  // true
        System.out.println(trie.startsWith("ba"));  // true
        System.out.println(trie.startsWith("cat")); // false
    }
}


