package p0617;

import java.util.Scanner;

public class C0617_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("문자를 입력하세요.");
//        String str = scan.nextLine();
//        System.out.println("입력한 문자열의 길이 : "+str.length());
        System.out.println("숫자를 입력하세요.");
        int x = scan.nextInt();
        int absX = x>=0?x:-x;
        System.out.println(absX);
    }
}
