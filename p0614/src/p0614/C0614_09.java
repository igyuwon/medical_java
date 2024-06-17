package p0614;

import java.util.Scanner;

public class C0614_09 {
    public static void main(String[] args) {
        int sca = 0;
        Scanner scan = new Scanner(System.in); // 콘손창안에서 입력 받겠다

        // 두 숫자를 입력 받아, 덧셈, 뺄셈, 곱셈, 나눗셈을 출력하시오.
        System.out.println("첫번째 숫자를 입력하세요. : ");
        float num1 = scan.nextInt();
        System.out.println("두번째 숫자를 입력하세요. : ");
        float num2 = scan.nextInt();

        System.out.println("덧셈 : "+(num1 + num2));
        System.out.println("뺄셈 : "+(num1 - num2));
        System.out.println("곱셈 : "+(num1 * num2));
        System.out.println("나눗셈 : "+(num1 / num2));

    }
}
