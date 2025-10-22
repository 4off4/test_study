package 정보처리기사실기;

public class t_2401_16 {
    static class classOne {
        int a, b;

        public classOne(int a, int b) {
            this.a = a;
            this.b = b;
        }

        public void print() {
            System.out.println(a + b);
        }

    }
    static class classTwo extends classOne {
        int po = 3;

        public classTwo(int i) {
            super(i, i+1);
        }

        public void print() {
            System.out.println(po*po);
        }
    }

    public static void main(String[] args) {
        classOne one = new classTwo(10);
        one.print();
    }
}
