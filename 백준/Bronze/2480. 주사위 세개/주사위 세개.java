import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (a==b && b==c) {
            System.out.println(10000+a*1000);
        } else if(a == b) {
            System.out.println(1000+a*100);
        }else if(c == b) {
            System.out.println(1000+b*100);
        }else if(a == c) {
            System.out.println(1000+a*100);
        }else{
            int max = Math.max(Math.max(a,b),c);
            System.out.println(max*100);
        }
    }

}
