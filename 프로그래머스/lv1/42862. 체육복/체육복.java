import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;

        Arrays.sort(reserve);
        Arrays.sort(lost);

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                    break;
                }
            }
        }

        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if(lost[i] - 1 == reserve[j] || lost[i] + 1 == reserve[j]) {
                    lost[i] = -1;
                    reserve[j] = -1;
                    answer++;
                }
            }
        }

        return answer;
    }
}