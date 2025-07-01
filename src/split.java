import java.util.Arrays;

public class split {
    public static void main(String[] args) {
        String str = "ITISTESTSTRING";
        String[] result = str.split("T");
        System.out.println(Arrays.toString(result));
    }
    /*답 : [I, IS, ES, S, RING]
    * 해설 : T을 기준으로 자르고 [3]에 해당하는 값을 RETURN */
}
