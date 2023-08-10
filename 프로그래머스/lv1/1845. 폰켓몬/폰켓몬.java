import java.util.*;
class Solution {
    public static int solution(int[] nums) {
        HashSet<Integer> answerSet = new HashSet<Integer>();
        int N = nums.length/2;
        for (int i = 0; i < nums.length; i++) {
            answerSet.add(nums[i]);
        }

        if (answerSet.size() > N) {
            return N;
        }else {
            return  answerSet.size();
        }
    }
}