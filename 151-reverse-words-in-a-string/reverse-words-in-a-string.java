class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i = s.length() - 1;

        while (i >= 0) {

            // skip spaces
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }

            if (i < 0) break;

            int end = i;

            // move to start of word
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            int start = i + 1;

            // prepend space ALWAYS
            ans.append(" ");
            ans.append(s, start, end + 1);
        }

        // remove leading space safely
        return ans.toString().trim();
    }
}