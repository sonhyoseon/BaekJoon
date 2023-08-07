import java.util.*;

class Solution {
    public static int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        int answer[] = new int[photo.length];
        for (int i = 0; i < name.length; i++){
            map.put(name[i], yearning[i]);
        }
        for (int i = 0; i < photo.length; i++) {
            for (String item: photo[i]) {
                answer[i] += map.getOrDefault(item, 0);
            }
        }
        return answer;
    }
}