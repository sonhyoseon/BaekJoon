import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if (b + c < 60) {
            System.out.println(a + " " + (b + c));
        } else {
            int temp = (b+c)/60;
            if((a+temp) < 24){
                System.out.println((a+temp) + " " + ((b + c)-(60*temp)));
            }else {
                System.out.println((a+temp-24) + " " + ((b + c)-(60*temp)));
            }
        }


    }

}
