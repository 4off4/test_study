
public class t05 {
    public static void main(String[] args) {
        A b = new B();
        b.paint();
        b.draw();
    }
}
class A {
    public void paint() {
        System.out.print("A");
        draw();
    }
    public void draw() {
        System.out.print("B");
        draw();
    }
}

class B extends A {
    public void paint() {
        super.draw();
        System.out.print("C");
        this.draw();
    }
    public void draw() {
        System.out.print("D");
    }
}
/* 답: BCDCC
*  해설: 자바의 동적 바인딩, 변수의 선언 타입이 아닌, 객체의 실제 타입을 기준으로 결정됨
*       실제 타입은 B의 자식 class이므로 A class의 draw() 메서드의 draw();는 B의 draw()를 말한다.
*       얼핏보면 무한 루프처럼 보이지만 오버라이딩 (A,B 모두 정의) 되어있음
* */