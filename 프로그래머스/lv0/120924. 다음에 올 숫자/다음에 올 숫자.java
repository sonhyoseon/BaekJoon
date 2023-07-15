class Solution {
    public int solution(int[] common) {

        if (common[2] - common[1] == common[1] - common[0]) {
            int t = common[2] - common[1];
            return t + common[common.length - 1];

        }else {
            int t = common[2] / common[1];
            return t * common[common.length - 1];

        }
    }
}