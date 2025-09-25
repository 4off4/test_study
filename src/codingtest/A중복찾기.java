package codingtest;

import java.util.HashMap;
import java.util.Map;

public class A중복찾기 {

    public static int solution(int[] array) {
        int maxCount = 0;
        int answer = 0;

        Map<Integer, Integer> map = new HashMap<>();

        for(int number : array){
            int count = map.getOrDefault(number, 0) + 1;

            if(count > maxCount){
                maxCount = count;
                answer = number;
            } else if(count == maxCount){
                answer = -1;
            }
            map.put(number, count);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] data = {3, 3, 4};
        //int[] data = {1, 2, 3, 3, 3, 4};
        System.out.println(solution(data));
    }
}
