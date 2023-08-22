class Solution {
    public static int solution(int number, int limit, int power) {
        int answer = 0;
        int arr[] = new int[number];
        for (int i = 0; i < number; i++) {
            int temp = i+1;
            int cnt = 0;
            for (int j = 1; j * j <= temp; j++) {
                if (j * j == temp) {
                    cnt++;
                }else if (temp % j == 0) {
                    cnt += 2;
                }
            }
            arr[i] = cnt;
        }
        for (int i = 0; i < number; i++) {
            if(arr[i] > limit) {
                arr[i] = power;
            }
            answer += arr[i];
        }

        return answer;
    }
}