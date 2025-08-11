package javajungseok.examples.chapter6;

public class Exercise6_5 {
    public static void main(String args[]) {
        Student1 s = new Student1("홍길동", 1, 1, 100, 60, 76);
        System.out.println(s.info());
    }
}

class Student1 {
    String name;
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student1(String name, int ban, int no, int kor, int eng, int math) {
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public String info() {
        int total = kor + eng + math;
        double average = Math.round(total / 3f * 10) / 10.0;
        return name + "," + ban + "," + no + "," + kor + "," + eng + "," + math + ","
                + total + "," + average;
    }
}
