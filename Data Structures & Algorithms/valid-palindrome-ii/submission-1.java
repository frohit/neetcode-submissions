class Solution {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;
        boolean isUsed = false;

        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;

            }else{
                if(isPalindrome(s.substring(i+1,j+1)) || isPalindrome(s.substring(i,j))){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
    private boolean isPalindrome(String s){
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;

            }else{
                return false;
            }
        }
        return true;
    }
}