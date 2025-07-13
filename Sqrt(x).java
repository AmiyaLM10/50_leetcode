class Solution {
    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        if (x == 1) {
            return 1;
        }
        
        for (int i = 1; i <= x / 2; i++) {
            long square = (long) i * i; 
            if (square == x) {
                return i;
            } 
            if (square > x) {
                return i - 1; 
            }
        }
        return x / 2; 
    }
}
