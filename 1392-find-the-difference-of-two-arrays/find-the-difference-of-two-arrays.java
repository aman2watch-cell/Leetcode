class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        HashSet<Integer> s1 = new HashSet<>();
        HashSet<Integer> s2= new HashSet<>();
        for(int i = 0;i<nums1.length;i++){
            s1.add(nums1[i]);
        }
        for(int j =0;j<nums2.length;j++){
            s2.add(nums2[j]);
        }
        List<List<Integer>>answer = new ArrayList<>();
        List<Integer>l1 = new ArrayList<>();
        List<Integer>l2 = new ArrayList<>();
        for(int x : s1){
            if(!s2.contains(x)){
                l1.add(x);
                
            }
        }

        for(int x : s2){
            if(!s1.contains(x)){
                l2.add(x);
            }
        }
        answer.add(l1);
        answer.add(l2);
        return answer;
    }
    
}