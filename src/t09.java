/* java 23년 3회 */
public class t09 {
    static class Parent {
        int compute(int num) {
            if(num <= 1)
                return num;
            return compute(num-1) + compute(num-2);
        }
    }

    static class Child extends Parent {
        int compute(int num) {
            if(num <= 1)
                return num;
            return compute(num-1) + compute(num-3);
        }
    }

    public class main {
        public static void main(String args[]) {
            Parent obj = new Child();
            System.out.print(obj.compute(7));
        }
    }
}