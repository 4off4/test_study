public class t01 {
    public static void main(String[] args) {
        int a=5,b=0;

        try{
            System.out.print(a/b);
        }catch(ArithmeticException e){
            System.out.print("출력1");
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.print("출력2");
        }catch(NumberFormatException e) {
            System.out.print("출력3");
        }catch(Exception e){
            System.out.print("출력4");
        }finally{
            System.out.print("출력5");
        }
    }
    /* 풀이 : 정수를 0으로 나누면 ArithmeticException 오류 리턴
        ArrayIndexOutOfBoundsException  : 정해진 배열의 크기보다 크거나 음수 index를 요청하는 경우
        NumberFormatException           : 숫자형 포맷 오류, String을 Integer.parseInt(""); 사용한 경우, NULL을 넣는 경우, 문자열 앞뒤 공백이 있는 경우
    */
}
