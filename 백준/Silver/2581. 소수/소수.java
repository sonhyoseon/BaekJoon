import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int min = b;

        for (int i = a; i <= b; i++) {
            boolean check = true;
            if(i == 1){
                check = false;
            }

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }

            if(check) {
                if(min > i) min = i;
                sum += i;
            }
        }
        if(sum == 0) {
            System.out.println(-1);
        }else {
            System.out.println(sum + "\n" + min);
        }

    }
}