
public class t07 {
    public static void main(String[] args) {
        String str1 = "Programming";
        String str2 = "Programming";
        String str3 = new String("Programming");

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));
        System.out.print(str2.equals(str3));
    }
}
/* 문제: 다음은 자바에 대한 문제이다. 알맞은 출력값을 작성하시오.
* 답: true
    false
    true
    true
* 해설: 문자열 리터럴은 Java의 문자열 상수 풀(string pool)에 저장
* 자바는 동일한 문자열 리터럴은 메모리 절약을 위해 같은 객체를 공유함다
* new String(...)은 항상 새로운 String 객체를 heap에 생성합니다. 따라서 다른 메모리 주소를 가집니다.
* */