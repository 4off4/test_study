public class chatAt {
    public static void main(String[] args) {
        String str = "abacabcd";
        boolean[] seen = new boolean[256];
        System.out.print(calculFn(str, str.length()-1, seen));
        // str.length : 8
        // str.length-1 : 7
        // c = d

        // result 1
        // index-1 = 6
        // c  = c

        // result 2
        // 5
        // c = b

        // result 3
        // 4
        // c = a

        // result 4
        // 3
        // c = c

        // result 5
        // 2
        // c = a

        // 1
        // c = b

        // 0
        // c = a
    }

    public static String calculFn(String str, int index, boolean[] seen) {
        if(index < 0) return "";
        char c = str.charAt(index);
        String result = calculFn(str, index-1, seen);
        if (!seen[c]) {      // ✅ 처음 본 문자일 때만
            seen[c] = true;  // 🔒 이후엔 다시 포함되지 않도록 표시
            return c + result;  // 📌 결과 앞에 붙이기
        }
        return result;  // ❌ 이미 본 문자는 무시
    }
}
