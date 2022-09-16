import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a[] = {1,1,2,2,2,8};
        int b[] = new int[6];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 6;i++) {
            b[i] = in.nextInt();
        }
        for (int i = 0; i < 6;i++) {
            System.out.println(a[i]-b[i]);
        }
    }

}
