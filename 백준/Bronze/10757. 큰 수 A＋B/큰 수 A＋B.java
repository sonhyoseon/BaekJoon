import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String a = input.next();
        String b = input.next();
        int maxLen = Math.max(a.length(), b.length());
        int aL[] = new int[maxLen+1];
        int bL[] = new int[maxLen+1];
        for(int i=a.length()-1, idx=0; i>=0; i--, idx++){
            aL[idx] = a.charAt(i) - '0';
        }
        for(int i=b.length()-1, idx=0; i>=0; i--, idx++){
            bL[idx] = b.charAt(i) - '0';
        }
        for(int i=0; i<maxLen; i++){
            aL[i+1] += (aL[i]+bL[i])/10; // 각 자릿수 덧셈 중 10을 넘으면 십의자리는 다음 덧셈할 때 더해서 같이 계산
            aL[i] = (aL[i]+bL[i])%10; // 일의자리만 해당 자릿수의 결과값으로 남긴다
        }
        if(aL[maxLen] != 0) // 마지막 자릿수 덧셈에서 10이 넘지 않아 마지막 배열에 0이 저장된경우 출력하지 않는다.
            System.out.print(aL[maxLen]);
        for(int i=maxLen-1; i>=0; i--)
            System.out.print(aL[i]);
    }
}