import java.util.*;

class Solution {
    public static ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> list = new ArrayList<>();

        int date = getDate(today);

        Map<String, Integer> termsMap = new HashMap<String, Integer>();

        for(int i = 0; i < terms.length; i++){
            termsMap.put(terms[i].split(" ")[0],Integer.parseInt( terms[i].split(" ")[1]));
        }

        for(int i = 0; i < privacies.length; i++){
            String[] privacy = privacies[i].split(" ");

            if (getDate(privacy[0]) + (termsMap.get(privacy[1]) * 28) <= date) {
                list.add(i + 1);
            }
        }

            return list;
    }
    private static int getDate(String today) {
        String[] date = today.split("\\.");
        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);
        return (year * 12 * 28) + (month * 28) + day;
    }
}