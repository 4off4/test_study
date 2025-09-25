package codingtest;

public class A짝수싫어 {
    public static int[] solution(int n) {
        int size = (n + 1 ) / 2;
        int[] answer = new int[size];

        int idx = 0;

        for(int i = 0; i <= n; i++) {
            if(i % 2 != 0) {
                answer[idx] = i;
                idx++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        solution(10);
    }
}

// 코테전용 라이브러리 메서드 util 만들기~ 