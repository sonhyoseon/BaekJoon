import java.util.*;


public class Solution {

    public static long[] solution(long x, int n) {
        long[] answer = new long[n];
        long temp = x;
        for (int i = 0; i < answer.length; i++){
            answer[i] = x;
            x = x + temp;
        }
        System.out.println("Arrays.toString(answer) = " + Arrays.toString(answer));
        return answer;
    }

}