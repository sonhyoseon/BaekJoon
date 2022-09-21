import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // make web site


        int t = in.nextInt();	// 테스트 케이스
        int[][] arr = new int[15][15];

        for (int i = 1; i <= 14; i++) {
            arr[0][i] = i;  //0층 i호에는 무조건 i명이 산다
        }
        for (int i = 1; i <= 14; i++) {
            for (int j = 1; j <= 14; j++) {
                arr[i][j] = arr[i][j-1] + arr[i-1][j];
            }
        }
        for (int i = 0; i < t; i++) {
            int k = in.nextInt();
            int n = in.nextInt();
            System.out.println(arr[k][n]);
        }


    }
}
