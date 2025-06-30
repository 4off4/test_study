public class ExceptionHandling {
    public static void main(String[] args) {
        int sum = 0;

        try {
            func();
        } catch (NullPointerException e) {
            sum = sum + 1;
        } catch (Exception e) {
            sum = sum + 10;
        } finally {
            sum = sum + 100;
        }
        System.out.print(sum);
    }

    static void func() throws Exception {
        throw new NullPointerException();
    }
    /* 정답: 101
    * 풀이: func 함수에서 NullPointerException에 catch 잡히게 됨
    * NullPointerException : 실제 값이 아닌 null을 가지고 있는 객체/변수를 호출할 때 발생
    * 0 + 1
    * 1 + 100 = 101
    * */
}
