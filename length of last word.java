class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int c = 0;
        int i = n - 1; 
        // Skip any trailing spaces
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }
        // Count the characters of the last word
        while (i >= 0 && s.charAt(i) != ' ') {
            c++;
            i--;
        }
        return c;
    }
}
