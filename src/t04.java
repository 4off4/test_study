class classOne {
    int a, b;

    public classOne(int a, int b) {
        this.a = a;     // a = 10, b = 11
        this.b = b;
    }

    public void print() {
        System.out.println(a + b); // 21
    }

}
class classTwo extends classOne {
    int po = 3;

    public classTwo(int i) {
        super(i, i+1);
    }

    public void print() {
        System.out.println(po*po);  // 9
    }
}

public class t04 {
    public static void main(String[] args) {
        classOne one = new classTwo(10);
        one.print();
    }
}

/* 답 : 9
*  해설 : 자바의 다형성 문제. 변수 타입이 부모여도, 객체가 자식이면 자식의 메서드가 실행됩니다.
* */