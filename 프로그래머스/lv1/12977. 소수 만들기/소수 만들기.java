class Solution {
    public static int solution(int[] nums) {
        int answer = 0;
        boolean chk = false;

        for (int i = 0; i < nums.length; i++){
            for (int j = i+1; j < nums.length; j++){
                for (int k = j + 1; k < nums.length; k++) {
                    int num = nums[i] + nums[j] + nums[k];
                    if (sosu(num)) {
                        answer++;
                    }
                }
            }
        }
        return answer;

    }

    public static boolean sosu(int num) {
        boolean check = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0){
                return false;
            }
        }
        return check;
    }
}