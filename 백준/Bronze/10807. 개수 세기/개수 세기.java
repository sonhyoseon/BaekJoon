import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b[] = new int[a];
        for (int i = 0; i < a; i++) {
            b[i] = scanner.nextInt();
        }
        int c = scanner.nextInt();
        int count = 0;
        for (int i = 0; i < a; i++) {
            if(b[i] == c) {
                count++;
            }
        }
        System.out.println(count);
    }
}
