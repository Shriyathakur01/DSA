class Solution {
    public boolean hasMatch(String s, String p) {
        int star = p.indexOf('*');

        String prefix = p.substring(0, star);
        String suffix = p.substring(star + 1);

        int i = s.indexOf(prefix);

        if (i == -1) return false;

        return s.indexOf(suffix, i + prefix.length()) != -1;
    }
}