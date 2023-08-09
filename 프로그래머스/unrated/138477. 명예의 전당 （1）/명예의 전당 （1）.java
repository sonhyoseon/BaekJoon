import java.util.*;

class Solution {
    public static List<Integer> solution(int k, int[] score) {
        ArrayList<Integer> result = new ArrayList<Integer>();

        ArrayList<Integer> answer = new ArrayList<Integer>();
        for(int i = 0; i < score.length; i++) {
            result.add(score[i]);
            Collections.sort(result);

            if (result.size() <= k) {
                answer.add(result.get(0));
            }else {
                answer.add(result.get(result.size() - k) );

            }
        }
        return answer;
    }

}