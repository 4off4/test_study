package codingtest;

public class A강조하기 {
    public static String solution(String myString) {
        return myString.toLowerCase().replace("a", "A");
    }
    public static void main(String[] args) {
        System.out.println(solution("abstract algebra"));
    }
}
