public class t03 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3, 4};
        int[] c = new int[]{1, 2, 3};

        check(a, b); // N
        check(a, c); // N
        check(b, c); // N
    }

    public static void check(int[] a, int[] b) {
        if (a==b) {
            System.out.print("O");
        }else{
            System.out.print("N");
        }

    }
}

/* 답: NNN
*  해설: 배열의 ==는 배열 내용이 같은지를 비교하는 것이 아니라 객체(주소) 참조 비교 하는 것
*       a와 b는 서로 다른 배열 인스턴스로 참조값이 다르기때문에 0가 아닌 N입니다.
* */