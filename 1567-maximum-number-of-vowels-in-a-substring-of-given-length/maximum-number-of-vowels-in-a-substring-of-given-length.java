class Solution {
    public boolean isVowel(char c){
        return c =='a' ||c == 'e' || c == 'i' || c == 'o' || c=='u';
                
    }
    public int maxVowels(String s, int k) {
        int left = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        for(int right = 0; right<= s.length()-1;right++){
            if(isVowel(s.charAt(right))){
                count ++;
            }
            if(right-left+1==k){
                max = Math.max(count,max);
                if(isVowel(s.charAt(left))){
                    count = count -1;
                }
                left++;
            }
        }
        return max;
    }
}

   