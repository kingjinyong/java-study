package javajungseok.chapters.chapter3;

public class OperationEx7 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        // 형변환으로 컴파일 에러 해결
        System.out.println(c);
    }
}
