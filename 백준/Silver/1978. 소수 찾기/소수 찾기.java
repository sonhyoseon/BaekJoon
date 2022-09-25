import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BufferedReader 선언 및 입력
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            boolean found = true;

            int m = sc.nextInt();

            if (m == 1) {
                continue;
            }
            for (int j = 2; j <= Math.sqrt(m); j++) {
                if(m % j == 0) {
                    found = false;
                    break;
                }
            }
            if(found) {
                count++;
            }
        }
        System.out.println(count);
    }
}