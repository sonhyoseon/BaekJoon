import java.util.*;

class Solution {
    public static String solution(String[] id_pw, String[][] db) {
        String answer = "";
        HashMap map = new HashMap<String,String>();
        for (int i = 0; i < db.length; i++) {
            map.put(db[i][0], db[i][1]);
        }
        if (map.containsKey(id_pw[0])) {
            if (map.get(id_pw[0]).equals(id_pw[1])) {
                return "login";
            }else {
                return "wrong pw";
            }
        }else {
            return "fail";
        }

    }
}