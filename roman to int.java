class Solution {
    public int romanToInt(String s) {
        int result = 0;
        for (int i = 0; i < s.length(); i++) {
            int current = romanToInt(s.charAt(i));
            if (i < s.length() - 1 && current < romanToInt(s.charAt(i + 1))) {
                result -= current; 
            } else {
                result += current; 
            }
        }
        
        return result;
    }
    private int romanToInt(char c) {
        switch (c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;  // In case of an invalid Roman numeral
        }
    }
}
