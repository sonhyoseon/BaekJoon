import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a[][] = new int[100][100];
        int b = scanner.nextInt();
        int c[][] = new int[b][2];
        int area = 0;

        for (int i = 0; i < b; i++) {
            c[i][0] = scanner.nextInt();
            c[i][1] = scanner.nextInt();
            for (int j = c[i][0]; j < c[i][0]+10;j++){
                for (int k = c[i][1]; k < c[i][1]+10;k++){
                    if (a[j][k] != 1){
                        a[j][k] = 1;
                        area++;
                    }
                }
            }
        }

        System.out.println(area);
    }
}
