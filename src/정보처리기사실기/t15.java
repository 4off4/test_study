package 정보처리기사실기;

/* java 25년 1회 */
public class t15 {
    public class Main {
        public static void main(String[] args) {
            System.out.println(calc("5"));
        }

        static int calc(int value) {
            if (value <= 1) return value;
            return calc(value - 1) + calc(value - 2);
        }

        static int calc(String str) {
            int value = Integer.valueOf(str);
            if (value <= 1) return value;
            return calc(value - 1) + calc(value - 3);
        }
    }
}

/*
    STEP 1. calc(4) + calc(3)

    STEP 2. calc(4)
    - calc(3) + calc(2)
    -> calc(3) => 1
    -> calc(2) => 1
    => calc = 2

    STEP 3. calc(3)
    - calc(2) + 1
    - 1 + 1  = 2

    결국 4
*/