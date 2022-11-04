import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while(a != 1) {
            for(int i = 2; i <= a; i++) {
                if(a % i == 0){
                    System.out.println(i);
                    a = a / i;
                    i = i-1;
                }
            }
        }
    }
}
