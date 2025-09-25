package codingtest;

import java.util.Arrays;

public class A중간값구하기 {

    public static int solution(int[] array) {
        Arrays.sort(array);
        return array[array.length/2];
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 7, 10, 11};
        System.out.println(solution(data));
    }
}
