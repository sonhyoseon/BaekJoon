import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // make web site

        boolean s = false;
        int a = in.nextInt();	// 테스트 케이스

        for (int i = a/5; i >=0 ; i--) {
            int b = a - 5 * i;
            if(b % 3 == 0) {
                s = true;
                System.out.println(i+(b/3));
                break;
            }
        }
        if (s != true) {
            System.out.println("-1");
        }

    }
}
