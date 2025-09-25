package codingtest;

public class A양꼬치 {
    public static int solution(int n, int k) {
        int sheep = 12000 * n;
        int drink = 2000;

        for(int i = 10; i <= n; i+=10) {
            if( n >= 10 ) k -= 1;
        }

        drink = drink * k;
        return sheep + drink;
    }
    public static void main(String[] args) {
        System.out.println(solution(10, 3));
        System.out.println(solution(64, 6));
    }
}
