import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BufferedReader 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String str;
        int[] arrNum;
        int result = 0;


        for (int i = 1; i < n; i++) {
            int num = i;
            int sum = 0;
            
            while (num != 0) {
                sum += num%10;
                num /= 10;
            }

            if(n == sum+i){
                result = i;
                break;
            }
        }
        System.out.println(result);

    }
}