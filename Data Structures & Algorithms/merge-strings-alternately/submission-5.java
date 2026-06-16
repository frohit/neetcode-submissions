class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        
        // Pre-allocate the exact capacity needed
        StringBuilder sb = new StringBuilder(len1 + len2);
        
        int i = 0;
        // Use a single pointer for the alternating phase
        while (i < len1 && i < len2) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
            i++;
        }
        
        // Append the remainder of whichever string is longer
        if (i < len1) {
            sb.append(word1.substring(i));
        } else if (i < len2) {
            sb.append(word2.substring(i));
        }
        
        return sb.toString();
    }
}