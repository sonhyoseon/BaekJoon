import java.util.*;

class Solution {
          public static String solution(String X, String Y) {
        ArrayList<Character> list = new ArrayList<Character>();
        String answer = "";
        //X에서 0~9까지의 개수
        int[] Xnum = new int[10];
        for(int i=0; i<X.length(); i++){
            int idx = (int)X.charAt(i) - '0';
            Xnum[idx]++;
        }

        //Y에서 0~9까지의 개수
        int[] Ynum = new int[10];
        for(int i=0; i<Y.length(); i++){
            int idx = (int)Y.charAt(i) - '0';
            Ynum[idx]++;
        }

        //X와 Y 비교
        int[] XYnum = new int[10];
        for(int i=0; i<10; i++){
            if(Xnum[i] > 0 && Ynum[i] > 0) {
                if(Xnum[i] <= Ynum[i]) XYnum[i] = Xnum[i];
                else if(Xnum[i] > Ynum[i]) XYnum[i] = Ynum[i];
            }
        }


        StringBuilder sb = new StringBuilder();
        int cnt = 0;
        for(int i=0; i<10; i++){
            cnt += XYnum[i];
            if(XYnum[i] > 0){
                for(int j=0; j<XYnum[i]; j++){
                    sb.append(i);
                }
            }
        }

        //reverse를 통해서 거꾸로 뒤집는다.
        answer = sb.reverse().toString();

        //0일경우 cnt와 XYnum[0]의 값이 같음.
        if(cnt == XYnum[0]) answer = "0";

        return cnt > 0 ? answer : "-1";
    }
}