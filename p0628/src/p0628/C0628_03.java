package p0628;

import java.util.Scanner;

public class C0628_03 {
    public static void main(String[] args) {
        // 문자열을 입력받아, 3번째의 문자를 출력하시오.
        // 문자열의 길이가 3칸 미만으로 입력이 되면, 다시 입력을 할 수 있도록 하시오.
        // 무한반복 - x가 입력되면 프로그램을 종료
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.println("문자열을 입력하세요.(x.종료)");
            String str = scan.nextLine();
            if (str.equals("x")) {
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            if (str.length()<3) {
                System.out.println("다시 입력하세요");
                continue;
            }

            System.out.println("[ 3번째 문자 ]");
            System.out.println(str.charAt(2));
        }

    }
}
