class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int left = 0;
        double sum = 0;
        double avg = Integer.MIN_VALUE;
        for(int right = 0;right<=nums.length-1;right++){
            sum +=nums[right];

            if(right-left+1==k){
                double cal = sum/k;
                avg = Math.max(avg,cal);
                sum-=nums[left];
                left++;
            }
        }
        return avg;
        
    }
}