import java.util.*;
class Solution {
    public static String solution(String[] participant, String[] completion) {

        Map<String, Integer> map = new HashMap<String, Integer>();

        for (String s : participant) {
            map.put(s, map.getOrDefault(s,0)+1);
        }
        for (String s : completion) {
            map.put(s, map.get(s) - 1);
        }

        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                return key;
            }
        }
        return null;

    }
}