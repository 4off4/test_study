public class t02 {
    public static class Collection<T>{
        T value;

        public Collection(T t){
            value = t;
        }

        public void print(){
            new Printer().print(value);         // 2번. 컴파일 후에는 타입 정보가 지워지고 내부적으로는 Object로 변환
                                                // 사실상  new Printer().print((Object) value);  // T → Object 이런 느낌
        }

        class Printer{
            void print(Integer a){
                System.out.print("A" + a);
            }
            void print(Object a){
                System.out.print("B" + a);
            }
            void print(Number a){
                System.out.print("C" + a);
            }
        }
    }

    public static void main(String[] args) {
        new Collection<>(0).print();            // 1번. Integer로 추론
    }
}

/* 답: B0
*  해설: 제네릭 문제 잘 풀기.
* */