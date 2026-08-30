class Solution {
    public boolean isVowel(char c){
        return c =='a' ||c == 'e' || c == 'i' || c == 'o' || c=='u';
                
    }
    public int maxVowels(String s, int k) {

        StringBuilder sb2 = new StringBuilder(s);
        int left = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        StringBuilder sb1 = new StringBuilder();
        for(int right = 0;right<=sb2.length()-1;right++){
            sb1.append(sb2.charAt(right));
            if(isVowel(sb2.charAt(right))){
                    count = count+1;
            }

            if(sb1.length() == k){
                max = Math.max(max,count);
                if(isVowel(sb1.charAt(0))){
                    count = count-1;

                }
                sb1.deleteCharAt(0);
                left++;
               
                       

                    
                    
                   
            }

        }
        return max;
        
    }
}