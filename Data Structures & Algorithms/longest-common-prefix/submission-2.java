class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0) return "";
        String first = strs[0];
        int fn = first.length();
        for(int i = 0;i<fn;i++){
            for(String s:strs){
                if(s.length() == i || s.charAt(i) != first.charAt(i)){
                    return s.substring(0,i);
                }
            }
        }
        return first;
    }
}