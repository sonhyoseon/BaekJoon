class Solution {
    public int solution(int[][] dots) {
            
        if (findSlope(dots[0], dots[1]) == findSlope(dots[2], dots[3])) {
            return 1;
        }

        if (findSlope(dots[0], dots[2]) == findSlope(dots[1], dots[3])) {
            return 1;
        }

        if (findSlope(dots[0], dots[3]) == findSlope(dots[1], dots[2])) {
            return 1;
        }

        return 0;
    }

    public double findSlope(int[] dot1, int[] dot2) {
        return (double) (dot2[1] - dot1[1]) / (dot2[0] - dot1[0]);
    }
}