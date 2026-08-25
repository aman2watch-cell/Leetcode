class Solution {
    public int maxOperations(int[] nums, int k) {
       Arrays.sort(nums);
        
        int i = 0;
        int j = nums.length-1;
        int count = 0;
       while(i<j){
        if(nums[i]>=k){
            i++;
        }else if(nums[j]>=k){
            j--;
        }else{
            int sum = nums[i]+nums[j];
            if(sum == k){
                count++;
                i++;
                j--;
            }else if (sum>k){
                j--;
            }else if (sum<k){
                i++;
            }
        }
       }
       return count;
    }
}