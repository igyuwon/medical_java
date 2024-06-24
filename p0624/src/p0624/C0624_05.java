package p0624;

import java.util.Scanner;

public class C0624_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 두개의 수와 1개의 사칙연산 +,-,*,/을
        // 입력받아 결과값을 출력하시오.


//        System.out.println("숫자를 입력하세요.");
//        int x = scan.nextInt();
//        System.out.println("숫자를 입력하세요.");
//        int x2 = scan.nextInt();
//        System.out.println("사칙연산을 입력하세요.");
//        String str = scan.next();
        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i+1)+"번째 숫자를 입력하세요.");
            arr[i] = scan.nextInt();

        }
        System.out.println("사칙연산을 입력하세요.");
        String str = scan.next();

        // cal() 메소드를 사용해서 구현하시오.
        // 인스턴스 메소드 = 객체 선언 후, 참조변수명.메소드명
        // 다른 클래스 빌드 때 오류 떠서 주석처리(Calculate 파일 수정해서)
        Calculate calc = new Calculate();
        int result = calc.cal(arr,str);
        System.out.println("결과값? : "+result);



//        int result = 0;
        // 10,5,+ = 15 / 10,5,- = 5
//        switch (str){
//            case "+":
//                result = x + x2;
//                break;
//            case "-":
//                result = x - x2;
//                break;
//            case "*":
//                result = x * x2;
//                break;
//            case "/":
//                result = x / x2;
//                break;
//
//        }
//        System.out.println("결과값 : "+result);


    }
}
