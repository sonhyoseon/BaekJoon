import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = 28;
        int a[] = new int[input+2];
        int b[] = new int[input];

        for (int i = 0; i < input; i++) {
            b[i] = scanner.nextInt() -1;
        }

        for (int i = 0; i < input+2; i++) {
            a[i] = i+1;
        }

        for (int i = 0; i < input; i++) {
            a[b[i]] = 0;
        }

        for (int i = 0; i < input+2; i++) {
            if(a[i] != 0) {
                System.out.println(a[i]);
            }
        }
    }
}
