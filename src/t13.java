public class t13 {

    public static void main(String[] args) {
        new Child();
        System.out.println(Parent.total);
    }

    static class Parent {
        static int total = 0;
        int v = 1;

        public Parent() {
            total += (++v); // total = 2
            show();
        }

        public void show() {
            total += total;
        }
    }

    static class Child extends Parent {
        int v = 10;

        public Child() {
            v += 2;         // v = 12
            total += v++;   // total = (6 + 12) => 18
            show();
        }

        @Override
        public void show() {
            total += total * 2;     // total = 6, 18 += 18*2 => 54
        }
    }
}
