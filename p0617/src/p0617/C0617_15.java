package p0617;

import java.util.Scanner;

public class C0617_15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 1부터 10까지 랜덤 숫자를 생성해서
        // 숫자 1개를 입력받아
        // 같으면 당첨, 다르면 꽝을 출력
        System.out.println("숫자를 입력하세요.");
        int number = scan.nextInt();
        int rannum = (int)(Math.random()*10)+1;
        if (number==rannum) System.out.println("당첨");
        else System.out.println("꽝 // "+"답:"+rannum);




//        // 1부터 100까지 숫자를 랜덤으로 생성해서 출력하시오.
//        System.out.println((int)(Math.random()*100)+1);
//
//        // 1부터 3까지 랜덤숫자
//        System.out.println((int)(Math.random()*3)+1);
//
//        // 1부터 45까지 랜덤숫자 생성해서 출력
//        System.out.println((int)(Math.random()*45)+1);

//        Math.random(); // 0<= x < 1
//        System.out.println(Math.random());
//
//        // 0-10까지 랜덤숫자를 출력
//        int num = (int)(Math.random()*11);
//        System.out.println(num);
//        // 2-10까지
//        int n2 = (int)(Math.random()*9)+2;
//        System.out.println(n2);
//        // 1-100까지 생성출력
//        int num1 = (int)(Math.random()*100)+1;
//        System.out.println(num1);
//        // 0-4까지 출력
//        int num2 = (int)(Math.random()*5);
//        System.out.println(num2);
//        // 0-19
//        int num3 = (int)(Math.random()*20);
//        System.out.println(num3);
    }
}
