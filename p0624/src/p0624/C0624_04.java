package p0624;

import java.util.Scanner;

public class C0624_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 세 수를 입력받아, 세 수를 더한 값을 출력하시오.
        int[] num = new int[3];

        for (int i = 0; i < num.length; i++) {
            System.out.printf("%d번째 숫자를 입력하세요. : ",i+1);
            num[i] = scan.nextInt();
        }
        // 객체 선언 후, 참조변수명.메소드명
        Cal c = new Cal();
        int result = c.add(num[0],num[1],num[2]);

        int sum = c.add2(num);

        System.out.println("더하기 합계 : "+result);

//        int sum = 0;
//
//        for (int i = 0; i < num.length; i++) {
//            System.out.printf("%d번째 숫자를 입력하세요. : ",i+1);
//            num[i] = scan.nextInt();
//            sum += num[i];
//        }
//        System.out.println("합은? : "+sum);

    } // main
} // class
