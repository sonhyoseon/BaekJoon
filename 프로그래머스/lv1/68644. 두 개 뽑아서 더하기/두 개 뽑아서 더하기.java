import java.util.*;

class Solution {
      public static TreeSet<Integer> solution(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i]+numbers[j]);
            }
        }
        System.out.println("set = " + set);

        return set;
    }
}