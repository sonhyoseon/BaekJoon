import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean c[] = new boolean[b+1];

        c[0] = true;
        c[1] = true;

        for (int i = 2; i < Math.sqrt(c.length); i++) {
            if(c[i]) {
                continue;
            }
            for(int j=i*i; j <c.length; j+=i) {
                c[j] = true;
            }
        }

        for (int i = a; i <= b; i++) {
            if(!c[i]) {
                System.out.println(i);
            }
        }

        }
}
