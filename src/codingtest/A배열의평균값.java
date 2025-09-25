package codingtest;

import java.util.Arrays;

public class A배열의평균값 {
    public static double solution(int[] numbers) {
        return Arrays.stream(numbers).average().orElse(0);
    }

    public static int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++) {
            if(i * 6 % n == 0) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //System.out.println(solution(numbers));
        System.out.println(solution(10));
    }
}
