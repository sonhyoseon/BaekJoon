import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum= 0;
        if(a >= 100){
            for (int i = 100; i <= a; i++) {
                int x = i / 100;
                int y = (i / 10)%10;
                int z = i % 10;
                if(x-y == y-z)
                    sum++;
            }
            System.out.println((sum+99));
        }else {
            System.out.println(a);
        }

    }

}
