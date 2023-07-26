class Solution {
    public static int solution(int n) {
        int answer = n+1;
        
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if(n == 2) {
            return 2;
        } 
        
        
        for(int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0) {
                answer += i + n/i;
                            if(n / i == i) {
                answer -= i;
            }
            }

        }
        return answer;

    }
}