class Solution {
    public int solution(int a, int b, int c, int d) {
        if(a == b && b == c && c == d)
            return 1111*a; // abcd가 전부 같다면
        else if(a == b && b == c)// abc만 같다면
            return ((10 * a + d)*(10 * a + d));
        else if(b == c && c == d)// bcd만 같다면
            return ((10 * b + a)*(10 * b + a));
        else if(c == d && d == a)// cda만 같다면
            return ((10 * c + b)*(10 * c + b));
        else if(d == a && a == b)// dab만 같다면
            return ((10 * d + c)*(10 * d + c));
        else if(a == b)//ab만 같다면
            if(c == d)
                return (a+c)*Math.abs(a - c);
            else
                return c * d;
        else if(a == c)//ac만 같다면
            if(b == d)
                return (a+b)*Math.abs(a - b);
            else
                return b * d;
        else if(a == d)//ad만 같다면
            if(c == b)
                return (a+c)*Math.abs(a - c);
            else
                return c * b;
        else if(b == c)//bc만 같다면
            if(a == d)
                return (b + a)*Math.abs(b - a);
            else
                return a * d;
        else if(b == d)//bd만 같다면
            if(a == c)
                return (b+a)*Math.abs(b - a);
            else
                return a * c;
        else if(c == d)//cd만 같다면
            if(a == b)
                return (a+c)*Math.abs(a - c);
            else
                return a * b;
        else if(d == a)//ab만 같다면
            if(b == c)
                return (d+b)*Math.abs(d - b);
            else
                return b * c;
        else{
            int min = a;
            System.out.println(min);
            min = Math.min(min, b);
            min = Math.min(min, c);
            return Math.min(min, d);
        }
    }
}