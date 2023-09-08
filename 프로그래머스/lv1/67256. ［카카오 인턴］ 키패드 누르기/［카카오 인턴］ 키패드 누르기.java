class Solution {
    public static String solution(int[] numbers, String hand) {
        String answer = "";
        boolean isRight = true;
        if(!hand.equals("right")){
            isRight = false;
        }
        int left =10;
        int right =12;


        for(int tmp: numbers){
            if(tmp==1||tmp==4||tmp==7){
                answer+="L";
                left = tmp;
            }else if(tmp==3||tmp==6||tmp==9){
                answer+="R";
                right = tmp;
            }else {
                if(tmp==0) tmp=11;
                int leftdist = Math.abs(tmp-left)/3+Math.abs(tmp-left)%3;
                int rightdist = Math.abs(tmp-right)/3+Math.abs(tmp-right)%3;

                if (leftdist == rightdist) {
                    if (isRight) {
                        right = tmp;
                        answer+="R";
                    }else{
                        left = tmp;
                        answer+="L";
                    }
                } else if (leftdist > rightdist) {
                    right = tmp;
                    answer+="R";
                } else {
                    left = tmp;
                    answer+="L";
                }
            }
        }

        return answer;
    }
}