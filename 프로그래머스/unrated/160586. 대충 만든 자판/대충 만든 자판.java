class Solution {
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        int[] alphas = new int[26];

        for (int i = 0; i < alphas.length; i++){
            alphas[i] = Integer.MAX_VALUE;
        }

        for (int i = 0; i < keymap.length; i++) {
            for (int j = 0; j < keymap[i].length(); j++) {
                int temp = keymap[i].charAt(j) - 'A';
                alphas[temp] = Math.min(alphas[temp] ,j + 1);
            }
        }

        for (int i = 0; i < answer.length; i++) {
            int temp = 0;

            for (int j = 0; j < targets[i].length(); j++) {
                if(alphas[targets[i].charAt(j) - 'A'] == Integer.MAX_VALUE){
                    answer[i] = -1;
                    break;

                }else {
                    temp += alphas[targets[i].charAt(j) - 'A'];
                    answer[i] = temp;

                }
            }
        }
        return answer;
    }
}