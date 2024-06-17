package p0614;

import java.util.Scanner;

public class C0614_12 {
    public static void main(String[] args) {
        // Integer.parseInt() - 문자열을 숫자로 변경
        // next(), nextLine(), nextInt(), nextDouble()
        // charAt()

        // 대문자를 입력하면 소문자로 치환하시오.
        Scanner scan = new Scanner(System.in);
        System.out.print("대문자를 입력하세요."); // ABC
        String str = scan.nextLine();
        char input = str.charAt(0);
        System.out.println((char)(input+32));
//        System.out.println(str.toLowerCase()); // 문자열 소문자변환 메소드 사용
    }
}
