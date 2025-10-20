package 정보처리기사실기;

/* java 23년 3회 */
public class t10 {
    public class main{
        public static void main(String[] args) {
            A b = new B();
            b.paint();
            b.draw();
        }
    }

    static class A {
        public void paint() {
            System.out.print("A");
            draw();
        }
        public void draw() {
            System.out.print("B");
            draw();
        }
    }

    static class B extends A {
        public void paint() {
            super.draw();
            System.out.print("C");
            this.draw();
        }
        public void draw() {
            System.out.print("D");
        }
    }
}
