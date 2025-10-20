package 정보처리기사실기;

/* java 25년 1회 */
public class t14 {
    public static void main(String[] args) {
        int[] data = {3, 5, 8, 12, 17};
        System.out.println(func(data, 0, data.length - 1));
    }
    static int func(int[] a, int st, int end) {
        if (st >= end) return 0;
        int mid = (st + end) / 2;
        return a[mid] + Math.max(func(a, st, mid), func(a, mid + 1, end));
    }

    /*
        step1. func(data, 0, 4)
        mid = 2
        => 8 + func(data, 0, 2), func(data, 3, 4)

        step2. func(data, 0, 2)
        mid = 1
        => 5 + func(data, 0, 1), func(data, 2, 2)

        -> func(data, 0, 1)
        mid = 0
        => 3 + max(func(a, 0, 0), func(a, 1, 1)
        ===> 0 반환

        최종 3 + 0 + 0

        step3. func(data, 3, 4)
        mid = 3
        12 + max( func(a, 3, 3), func(a, 4, 3) )
        최종 12 + 0 + 0

        최최종 8 + 12 = 20
    */
}