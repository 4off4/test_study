package 정보처리기사실기;

public class t_2302_14 {
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