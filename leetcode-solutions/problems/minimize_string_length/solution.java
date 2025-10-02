import java.util.HashSet;
import java.util.Set;

class Solution {
    public int minimizedStringLength(String s) {
        Set<Character> unique = new HashSet<>();
        for (char c : s.toCharArray()) {
            unique.add(c);
        }
        return unique.size();
    }
}
