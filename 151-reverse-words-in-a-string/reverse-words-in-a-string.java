class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(s.length());
        String S = s.trim();

       
        String [] words = S.split(" +");
        for(int i= words.length -1;i>=0;i--){
            sb.append(words[i]+" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();



       
       
      
           
        
       
       



        
    }
}