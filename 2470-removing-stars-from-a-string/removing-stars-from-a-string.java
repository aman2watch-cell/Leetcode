class Solution {
    public String removeStars(String s) {
        StringBuilder sb = new StringBuilder();
        Stack <Character> s1 = new Stack <>();
        for(int i = s.length()-1;i>=0;i--){
            s1.push(s.charAt(i));
        }
        while(!s1.isEmpty()){

        
            if(s1.peek()!='*'){
                sb.append(s1.peek());
                s1.pop();
            }
            else{

            
                sb.deleteCharAt(sb.length()-1);
                s1.pop();

            }
        }
        return sb.toString();
        
    
        
    }
}