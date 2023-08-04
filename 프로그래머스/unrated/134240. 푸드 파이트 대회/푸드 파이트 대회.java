import java.util.*;
class Solution {
    public static String solution(int[] food) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                list.add(i);
            }

        }
        list.add(0);

        for (int i = list.size() - 1; i > 0  ; i--) {
            list.add(list.get(i - 1));
        }
        StringBuilder sb = new StringBuilder();
        for (Integer item : list) {
            sb.append(item);
        }
        //System.out.println("queue = " + list);

        return sb.toString();
    }
}