import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // BufferedReader 선언 및 입력
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        int temp = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n-1; i++) {
            if(arr[i]>arr[i + 1]){
                temp = arr[i+1];
                arr[i+1] = arr[i];
                arr[i] = temp;
                i = -1;
            }
        }

        for (int i = 0; i < n; i++)
            System.out.println(arr[i]);

    }
}