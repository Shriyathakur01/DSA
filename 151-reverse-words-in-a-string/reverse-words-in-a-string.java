class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int n = s.length();

        for (int i = n - 1; i >= 0; i--) {

            StringBuilder word = new StringBuilder();

            // Build the word in reverse
            while (i >= 0 && s.charAt(i) != ' ') {
                word.append(s.charAt(i));
                i--;
            }
            if (word.length() > 0) {
                word.reverse();
                ans.append(" ").append(word);
            }
        }

        // Remove the first extra space
        return ans.length() == 0 ? "" : ans.substring(1);
        
    }
}