class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs==null || strs.length==0) {
            return "";
        }
        return divideAndConquer(strs,0,strs.length-1);
    }
    private String divideAndConquer(String[] strs, int left, int right) {
        if (left == right) {
            return strs[left];
        }
        int mid = (left+right)/2;
        String pLeft = divideAndConquer(strs,left,mid);
        String pRight = divideAndConquer(strs,mid + 1,right);
        return cp(pLeft, pRight);
    }
    private String cp(String p1, String p2) {       //p is for prefix and cp is for common prefix
        int minLength = Math.min(p1.length(), p2.length());
        for (int i = 0; i < minLength; i++) {
            if (p1.charAt(i) != p2.charAt(i)) {
                return p1.substring(0, i);  // Common prefix until this point
            }
        }
        
        return p1.substring(0, minLength);  
    }
}
