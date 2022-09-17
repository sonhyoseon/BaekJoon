import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        char[] a = s1.toCharArray();
        Scanner in = new Scanner(System.in);
        boolean check = true;
        String s2 = in.nextLine();
        char[] b = s2.toCharArray();
        for (int i = 0; i < a.length; i++) {
            check = false;
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    System.out.print(j+" ");
                    check = true;
                    break;
                }
            }
            if(check == false) {
                System.out.print("-1 ");
            }
        }
    }

}
