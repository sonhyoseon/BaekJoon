import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int arr[][] = new int[2][100];
        int a = in.nextInt();
        int b = in.nextInt();
        int sum = 0;
        for (int i = 0; i < b; i++) {
            arr[0][i] = in.nextInt();
            arr[1][i] = in.nextInt();
            sum += arr[0][i]*arr[1][i];
        }
        if (sum == a) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

}
