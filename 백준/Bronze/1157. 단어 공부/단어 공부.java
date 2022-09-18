import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max= -1;
        char result = '?';
        String b = in.nextLine().toUpperCase();
        int[] output = new int[26];

        for (int i = 0; i < b.length(); i++) { // 담을 문자열
            output[b.charAt(i)-65]++;
            if(max < output[b.charAt(i)-65]){
                max = output[b.charAt(i)-65];
                result = b.charAt(i);
            } else if (max == output[b.charAt(i)-65] ) {
                result = '?';
            }
        }
            System.out.println(result);
    }
}
