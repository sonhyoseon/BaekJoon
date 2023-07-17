class Solution {
    public String solution(String code) {
               int mode = 0;
        String ret = "";
        for (int i = 0; i < code.length(); i++) {
            if (mode == 0) {
                if (code.charAt(i) == '1') {
                    mode = 1;
                } else {
                    if (i % 2 == 0) {
                        ret = ret + code.charAt(i);
                    }
                }

            } else if (mode == 1) {
                if (code.charAt(i) == '1') {
                    mode = 0;
                } else {
                    if (i % 2 == 1) {
                        ret = ret + code.charAt(i);
                    }
                }
            }
        }
        if(ret == "") {
            return "EMPTY";
        }
        return ret;
    }
}