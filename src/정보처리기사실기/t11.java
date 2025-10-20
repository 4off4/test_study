package 정보처리기사실기;

/* java 23년 3회 */
public class t11 {

    static class Person {
        private static String name;
        public Person(String val) {
            name = val;
        }
        public static String get() {
            return name;
        }
        public void print() {
            System.out.println(name);
        }
    }

    public class main {
        public static void main(String[] args) {
            Person obj = new Person("Kim");
            obj.print();
        }
    }
}