class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum = 0;
        int rightsum = 0;
        for(int i = 0 ;i<nums.length;i++){
            leftsum = 0;
            rightsum = 0;
            
            
            if(i==nums.length-1){
                rightsum = 0;
            }
            for(int j = 0;j<i;j++){
                if(i==0){
                    leftsum = 0;
                }
                
                leftsum = leftsum + nums[j];
            }
            for(int k = i+1;k<nums.length;k++){
                if(i ==nums.length-1){
                    rightsum = 0;
                }
                
                rightsum = rightsum+nums[k];
            }
            if(leftsum==rightsum){
                return i;
            }
        }
        return -1;
        
    }
}