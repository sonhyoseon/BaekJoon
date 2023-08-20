class Solution {
    public static int solution(int n, int m, int[] section) {
        int answer = 1;
        int start = section[0];

        for (int i = 0; i < section.length; i++) {
            if (!(start <= section[i] && section[i] <=  start + m - 1)){
                start = section[i];
                answer++;
            }
        }

        return answer;
    }
}