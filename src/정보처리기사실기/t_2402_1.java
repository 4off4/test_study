package 정보처리기사실기;

public class t_2402_1 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4};
        int[] b = new int[]{1, 2, 3, 4};
        int[] c = new int[]{1, 2, 3};

        check(a, b);
        check(a, c);
        check(b, c);
    }

    public static void check(int[] a, int[] b) {
        if (a==b) {
            System.out.print("O");
        }else{
            System.out.print("N");
        }

    }
}