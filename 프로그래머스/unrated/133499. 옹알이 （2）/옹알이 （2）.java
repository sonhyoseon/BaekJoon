class Solution {
    public static int solution(String[] babblings) {
        int answer = 0;
        String[] str = new String[]{ "aya", "ye", "woo", "ma"};

        for (int i = 0; i < babblings.length; i++) {
            if(babblings[i].contains("ayaaya") || babblings[i].contains("yeye") || babblings[i].contains("woowoo") || babblings[i].contains("mama")) {
                continue;
            }
            babblings[i] = babblings[i].replace("aya", " ");
            babblings[i] = babblings[i].replace("ye", " ");
            babblings[i] = babblings[i].replace("woo", " ");
            babblings[i] = babblings[i].replace("ma", " ");
            babblings[i] = babblings[i].replace(" ", "");
            if (babblings[i].length() == 0) {
                answer++;
            }

        }
        return answer;
    }
}