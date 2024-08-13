import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i = 0; i < nums.length;i++){
            int compliment = target - nums[i];
            if(ans.containsKey(compliment)){
                return new int[]{i,ans.get(compliment)};
            }
            ans.put(nums[i], i);
        }
        return null;
    }
}