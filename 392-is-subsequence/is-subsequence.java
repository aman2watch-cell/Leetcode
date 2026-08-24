class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        int m = t.length();
        int i = 0 ;
        int j = 0;
        StringBuilder sb = new StringBuilder();
        while(i<=n-1 && j<=m-1){
            if(s.charAt(i)==t.charAt(j)){
                sb.append(t.charAt(j));
                i++;
                j++;
            }else if(s.charAt(i)!=t.charAt(j)){
                j++;
            }
        }

        String r = sb.toString();
        if(r.equals(s)){
            return true;
        }else{
            return false;
        }

            
            










            
        
        
    }
}