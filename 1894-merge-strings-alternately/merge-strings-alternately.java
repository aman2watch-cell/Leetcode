class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int w = Math.min(m,n);
        StringBuilder sb = new StringBuilder(m+n);
        for(int i = 0;i<w;i++){
            sb.append(word1.charAt(i));
        
       
            sb.append(word2.charAt(i));
        }
        if(m>w){
            for(int i = w;i<m;i++){
                sb.append(word1.charAt(i));
            }
        }
        if(n>w){
             for(int i = w;i<n;i++){
                sb.append(word2.charAt(i));
             }

        }
        return sb.toString();
        
    }
}