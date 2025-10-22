package 정보처리기사실기;

/* 정적 메서드 (static)의 경우에 부모 메서드를 따른다. */
public class t_2502_10 {
    public static class Parent {
        public int x(int i) { return i + 2; }
        public static String id() { return "P";}
    }

    public static class Child extends Parent {
        public int x(int i) { return i + 3; }
        public String x(String s) { return s + "R"; }
        public static String id() { return "C"; }
    }

    public static void main(String[] args) {
        Parent ref = new Child();
        System.out.println(ref.x(2) + ref.id());
    }
}