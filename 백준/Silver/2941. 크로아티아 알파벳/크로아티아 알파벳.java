import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BufferedReader 선언 및 입력
        Scanner sc = new Scanner(System.in);

        String[] str = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String st = sc.nextLine();

        for (int i = 0; i < str.length; i++) {
            if(st.contains(str[i])) {
                st = st.replace(str[i],"a");
            }
        }
        System.out.print(st.length());
    }
}