package p0624;

public class C0624_08 {
    public static void main(String[] args) {


//        Stu_score s = new Stu_score("s0001","홍길동",100,100,100);
//        System.out.println("합계 : "+s.total);
//        System.out.println("평균 : "+s.avg);
//        Stu_score s2 = new Stu_score();
//        s.kor = 100;
//        System.out.println("s.kor : "+s.kor);


//        println_boolean();
//        println_char();
//
        int a = 10;
//        int a = 100;

        // 5 펙토리얼
        int result = 1;
        for (int i = 5; i >0; i--) {
            result *= i;
        }

        // change()
        C0624_08 c = new C0624_08();
        c.change(a);

        System.out.println(result);
        add(); // 객체선언 없이 클래스명.메소드명, 같은 클래스 내에서는 클래스명 생략 가능
    }

    void change(int a){ // 인스턴스 메소드 - 객체선언 후, 참조변수명.메소드명
        System.out.println(a);
    }

    void change(int a, int b){
        System.out.println(a+b);
    }

    static void add() {

    }
}
