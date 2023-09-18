class Solution {
    public static int[] solution(String[] wallpaper) {
        int[] answer = new int[4];
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        int xMax = -1;
        int yMax = -1;

        for(int i = 0; i < wallpaper.length; i++) {
            for(int j = 0; j < wallpaper[0].length(); j++) {
                if(wallpaper[i].charAt(j) =='#'){
                    if(xMin > i){
                        xMin = i;
                    }
                    if(xMax < i){
                        xMax = i;
                    }
                    if(yMin > j){
                        yMin = j;
                    }
                    if(yMax < j){
                        yMax = j;
                    }

                }
            }
        }
        answer[0] = xMin;
        answer[1] = yMin;
        answer[2] = xMax+1;
        answer[3] = yMax+1;
        return answer;
    }
}