package 정보처리기사실기;

public class t_2203_20 {
    public static void main(String[] args) {
        int a = 0;
        for(int i=1; i<999; i++){
            if(i%3==0 && i%2!=0)
                a = i;
        }
        System.out.print(a);
    }
}