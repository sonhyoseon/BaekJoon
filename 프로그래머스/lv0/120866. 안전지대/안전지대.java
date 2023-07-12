class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        int x[] = {0, -1, -1, -1, 0, 1, 1, 1};
        int y[] = {1, 1, 0, -1, -1, -1, 0, 1};

        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[0].length; j++) {
                if (lines[i][j] == 1) {

                    for (int k = 0; k < 8; k++) {
                        if((i + x[k]) >= 0 && (i + x[k])  < lines.length && (j + y[k]) >= 0 && (j + y[k]) < lines.length && lines[i + x[k]][j + y[k]] != 1){

                            lines[i + x[k]][j + y[k]] = -1;
                        }
                    }
                }

            }
        }
        for (int i = 0; i < lines.length; i++) {
            for (int j = 0; j < lines[0].length; j++) {
                if (lines[i][j] == 0) {
                    answer++;
                }
            }
        }



        return answer;
    }
}