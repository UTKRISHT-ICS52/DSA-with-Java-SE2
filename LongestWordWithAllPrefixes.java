import java.util.*;

public class LongestWordWithAllPrefixes {
    public static String longestWord(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        String ans = "";
        for (String word : words) {
            boolean valid = true;
            for (int i = 1; i <= word.length(); i++) {
                if (!set.contains(word.substring(0, i))) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                if (word.length() > ans.length() ||
                   (word.length() == ans.length() && word.compareTo(ans) < 0)) {
                    ans = word;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] words = {"a", "ap", "app", "appl", "apple", "apply"};
        System.out.println(longestWord(words)); // apple
    }
}

