import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int n = 1;
        int b = 1;

        while (a > (n*(n+1))/2){
            n++;
            b = a - (n*(n-1))/2;
        }

        if(n % 2 != 0){
            System.out.println((n-b+1)+"/"+b);
        }else {
            System.out.println(b+"/"+(n-b+1));

        }
    }
}
