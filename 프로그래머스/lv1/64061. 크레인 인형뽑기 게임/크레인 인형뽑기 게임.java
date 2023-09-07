import java.util.*;

class Solution {
    public static int solution(int[][] board, int[] moves) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Arrays.deepToString(board)); = " + Arrays.deepToString(board));
        for (int i = 0; i < moves.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[j][moves[i] - 1] != 0){
                    if(list.size() != 0 && list.get(list.size() - 1) == board[j][moves[i] - 1]){
                        list.remove(list.size() - 1);
                        answer += 2;
                    }else {
                        list.add(board[j][moves[i] - 1]);
                    }
                    board[j][moves[i] - 1] = 0;
                    break;
                }
            }
        }

        return answer;
    }
}