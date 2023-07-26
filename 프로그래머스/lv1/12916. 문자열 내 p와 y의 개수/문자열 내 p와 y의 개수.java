class Solution {
    static boolean solution(String s) {
        boolean answer = true;
        int a = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.toLowerCase().charAt(i) == 'p') {
                a += 1;
            } else if (s.toLowerCase().charAt(i) == 'y') {
                a -= 1;
            }
        }

        if (a != 0) {
            return false;
        }
        return answer;
    }
}