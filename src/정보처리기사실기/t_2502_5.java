package 정보처리기사실기;

public class t_2502_5 {
    public class Main {
        public static void change(String[] data, String s){
            data[0] = s;
            s = "Z";
        }

        public static void main(String[] args) {
            String data[] = { "A" };
            String s = "B";

            change(data, s);
            System.out.print(data[0] + s);
        }
    }
}