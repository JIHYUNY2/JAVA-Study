//기본형에 변수 대입해보기
public class VarChange1 {
    public static void main(String[] args) {
        // 기본형에 값 대입하기
        int a = 10;
        int b = a;
        System.out.println("a = " + a); // 10
        System.out.println("b = " + b); // 10
        // a 변경
        a = 20;
        System.out.println("변경 a = 20");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 10
        // b 변경
        b = 30;
        System.out.println("변경 b = 30");
        System.out.println("a = " + a); // 20
        System.out.println("b = " + b); // 30
    }

}
