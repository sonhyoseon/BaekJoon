import java.util.*;

class Solution {
    public int solution(String A, String B) {
        Queue<Character> queueA = new LinkedList<>();
        Queue<Character> queueB = new LinkedList<>();

        if(A.equals(B)){
            return 0;
        }

        for (int i = A.length()-1; i >= 0; i--){
            queueA.add(A.charAt(i));
            queueB.add(B.charAt(i));
        }
        for (int i = 0; i < A.length(); i++){
                queueA.add(queueA.poll());
            if (queueA.equals(queueB)) {
                return i + 1;
            }
        }



        return -1;

    }

}