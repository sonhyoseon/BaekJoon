class Solution {
    public static String solution(String s, String skip, int index) {
        String answer = "";
        boolean skiparr[] = new boolean[26];
        for (int i = 0; i < skip.length(); i++) {
            skiparr[skip.charAt(i) - 'a'] = true;
        }
        for (int i = 0; i < s.length(); i++) {
            int cnt = 0;
            int t = s.charAt(i) - 'a';
            while (cnt < index) {
                t++;
                t %= 26;
                if (!skiparr[t%26]) {
                    cnt++;
                }
            }
            answer = answer + (char) (t + 97);
        }
        return answer;
    }
}