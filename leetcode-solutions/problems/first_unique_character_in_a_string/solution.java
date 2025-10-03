class Solution {
    public int firstUniqChar(String s) {
        // frequency array for lowercase letters
        int[] freq = new int[26];

        // count frequency of each character in s
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            freq[c - 'a']++;
        }

        // find first unique character
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                System.out.println(i); // print index
                return i;              // return index
            }
        }

        System.out.println("-1");
        return -1;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String str1 = "leetcode";
        String str2 = "loveleetcode";
        String str3 = "aabb";

        sol.firstUniqChar(str1); 
        sol.firstUniqChar(str2); 
        sol.firstUniqChar(str3); // prints -1
    }
}
