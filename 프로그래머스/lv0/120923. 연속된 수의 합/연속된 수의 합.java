class Solution {
    public int[] solution(int num, int total) {
        int arr[] = new int[num];

        if(num % 2 != 0){
            for (int i = 0; i < num; i++) {
                arr[i] = (total/num) - (num / 2) + i;
            }
        }else {
            for (int i = 0; i < num; i++) {
                arr[i] = (total/num) - (num/2) +1 + i;
            }

        }
        return arr;
    }
}