class Solution {
    public static int[] solution(int[] lottos, int[] win_nums) {
        int zeroCnt = 0;
        int matched = 0;
        for(int i = 0; i < lottos.length; i++) {
            if(lottos[i] == 0) {
                zeroCnt++;
            } else {
                for (int j = 0; j < win_nums.length; j++) {
                    if(lottos[i] == win_nums[j]) {
                        matched++;
                    }
                }
            }

        }
        int min = matched;
        int max = matched + zeroCnt;

        int[] answer = {Math.min(7 - max, 6), Math.min(7 - min, 6)};

        return answer;
    }
}