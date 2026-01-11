import java.util.*;

class WordSearchII {

    // Trie Node
    static class TrieNode {
        TrieNode[] children = new TrieNode[26];
        String word; // store complete word at end
    }

    static TrieNode root = new TrieNode();
    static List<String> result = new ArrayList<>();

    // Insert word into Trie
    static void insert(String word) {
        TrieNode curr = root;
        for (char ch : word.toCharArray()) {
            int idx = ch - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new TrieNode();
            }
            curr = curr.children[idx];
        }
        curr.word = word;
    }

    // Main function
    public static List<String> findWords(char[][] board, String[] words) {

        // Build Trie
        for (String word : words) {
            insert(word);
        }

        int rows = board.length;
        int cols = board[0].length;

        // DFS from each cell
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                dfs(board, i, j, root);
            }
        }

        return result;
    }

    // DFS + Backtracking
    static void dfs(char[][] board, int i, int j, TrieNode node) {

        char ch = board[i][j];
        if (ch == '#' || node.children[ch - 'a'] == null) {
            return;
        }

        node = node.children[ch - 'a'];

        // Found a word
        if (node.word != null) {
            result.add(node.word);
            node.word = null; // avoid duplicates
        }

        board[i][j] = '#'; // mark visited

        // Explore neighbors
        if (i > 0) dfs(board, i - 1, j, node);
        if (j > 0) dfs(board, i, j - 1, node);
        if (i < board.length - 1) dfs(board, i + 1, j, node);
        if (j < board[0].length - 1) dfs(board, i, j + 1, node);

        board[i][j] = ch; // backtrack
    }

    // Driver
    public static void main(String[] args) {
        char[][] board = {
                {'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}
        };

        String[] words = {"oath","pea","eat","rain"};

        System.out.println(findWords(board, words)); // [oath, eat]
    }
}

