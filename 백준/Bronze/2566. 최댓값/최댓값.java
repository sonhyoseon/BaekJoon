import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c[][] = new int[9][9];
        int max = -1;
        int x = -1;
        int y = -1;

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                c[i][j] = scanner.nextInt();
                if(c[i][j] > max){
                    max = c[i][j];
                    x = i+1;
                    y = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.println(x+" "+y);
    }
}
