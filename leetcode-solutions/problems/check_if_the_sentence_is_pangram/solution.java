class Solution {
    public boolean checkIfPangram(String sentence) {
        boolean[] res = new boolean[26]; 
        int count = 0; 

        for (char c : sentence.toCharArray()) {
            int index = c - 'a';
            if (!res[index]) {
                res[index] = true;
                count++;
                if (count == 26) return true; 
            }
        }

        return count == 26;
    }
}
