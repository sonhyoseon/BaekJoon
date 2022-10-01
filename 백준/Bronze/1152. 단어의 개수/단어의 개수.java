import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = 0;
        String str = sc.nextLine();

        for(int j = 0; j < str.length(); j ++){	//우선 공백의 개수를 먼저 세아린다
            if(str.charAt(j) == ' '){
                cnt++;
            }
        }
        if(str.charAt(0) != ' ' && str.charAt(str.length()-1) != ' '){ //첫 번째와 마지막이 공백이 아닌 경우
            cnt = cnt + 1;
        }
        if(str.charAt(0) == ' ' && str.charAt(str.length()-1) == ' '){ //첫 번째와 마지막이 공백인 경우
            cnt = cnt - 1;
        }
        System.out.println(cnt);

    }
}