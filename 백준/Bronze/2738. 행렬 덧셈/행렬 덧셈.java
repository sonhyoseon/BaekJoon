import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c[][] = new int[a][b];
        int d[][] = new int[a][b];

        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b; j++) {
                c[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b; j++) {
                d[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b; j++) {
                d[i][j] = d[i][j] + c[i][j];
            }
        }

        for (int i = 0; i <a; i++) {
            for (int j = 0; j <b; j++) {
                System.out.print(d[i][j]+" ");
            }
            System.out.println();
        }

    }
}
