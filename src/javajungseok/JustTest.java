package javajungseok;

public class JustTest {
    public static void main(String[] args) {
        var score = 10;
        char grade = switch (score / 10) {
            case 9, 10 -> 'A';
            default -> 'F';
        };
        System.out.println(grade);
    }

}
