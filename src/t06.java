class Parent {
    int compute(int num) {
        if(num <= 1)
            return num;
        return compute(num-1) + compute(num-2);
    }
}

class Child extends Parent {
    int compute(int num) {
        if(num <= 1)
            return num;
        return compute(num-1) + compute(num-3);
    }
}
public class t06 {
    public static void main(String args[]) {
        Parent obj = new Child();
        System.out.print(obj.compute(7));
    }
}
/* 답 : 2
*  해설 : Child의 compute 안에서 코드 진행
* */