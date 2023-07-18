class Solution {
    public String solution(String polynomial) {
       String arr[] = polynomial.split(" +");
        int a = 0;
        int b = 0;
        for (String s : arr) {
            if (s.equals("x")) {
                a += 1;
            } else if (s.contains("x")) {
                a += Integer.parseInt(s.substring(0, s.length() - 1));
            } else if (!s.equals("+")) {
                b += Integer.parseInt(s);
            }
            
           
        }
        if(a != 0 && b != 0) {
            if(a == 1){
                return "x + "+b;
            }else {
                return a+"x + "+b;
            }

        } else if (a != 0 && b == 0) {
            if(a == 1){
                return "x";
            }else {
                return a+"x";
            }
        } else if (a == 0 && b != 0) {
            return b+"";
        }
        return "";
    }
}