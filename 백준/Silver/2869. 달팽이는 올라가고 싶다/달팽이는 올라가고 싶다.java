import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());  //올라가는 높이
        int b = Integer.parseInt(st.nextToken());  //내려오는 높이
        int v = Integer.parseInt(st.nextToken());  //막대 높이
        int x = (int)Math.ceil((double)(v-a) / (double)(a-b));
        System.out.print(x+1);
    }
}