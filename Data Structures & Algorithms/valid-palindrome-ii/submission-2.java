class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        boolean isUsed = false;

        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;

            } else {
                if (isPalindrome(s,i + 1, j) || isPalindrome(s,i, j-1)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isPalindrome(String s,int i,int j) {
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;

            } else {
                return false;
            }
        }
        return true;
    }
}