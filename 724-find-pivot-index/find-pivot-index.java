class Solution {
    public int pivotIndex(int[] nums) {
        int[] prefix = new int[nums.length];
        prefix[0]= nums[0];
        for(int i = 1;i<nums.length;i++){
            prefix[i] = prefix[i-1]+nums[i];
        }

        int leftsum = 0;
        int rightsum = 0;
        for(int i = 0 ;i<prefix.length;i++){
            leftsum = 0;
            rightsum = 0;
            
            

            if(i==0){
                leftsum = 0;
            }else{

            
                
                leftsum = prefix[i-1];
            }
            
            if(i ==nums.length-1){
                rightsum = 0;
            }else{

            
                
                rightsum = prefix[prefix.length-1]-nums[i]-leftsum;
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
        
    }
}