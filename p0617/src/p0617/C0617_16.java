package p0617;

import java.util.Scanner;

public class C0617_16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//         구구단 출력 시 2~9단까지 출력하는데 홀수단을 출력하시오.
        for (int i = 1; i <= 9; i++) {
            for (int j = 2; j <= 9; j++) {
                if (j % 2 != 0) {
                System.out.print(j + "X" + i + "=" + (j * i) + "\t\t");
                }
            }
            System.out.println();
        }

//        int sum = 0;
//        int i = 0;
//        for (i=1; i<=10; i++){
//            sum += i;
//        }
//        System.out.println((i-1)+"까지의 합 : "+sum);


//        int sum = 0;
////        int i = 0;
//        // 1-100까지 합을 구하는데, sum 값이 150을 넘었을 때 i,sum 값을 출력하시오.
//        for (int i=1; i<=100; i++) {
//            sum += i;
//            if (sum >= 150) {
//                System.out.println("i : " + i);
//                break;
//            }
//        }
////        System.out.println("i : "+ i);
//        System.out.println("sum : "+sum);


//        // 구구단 중첩 for문 사용
//        for (int j = 2; j <= 9; j++) {
//            System.out.print(j + "단\t\t\t");
//        }
//        System.out.println();
//
//        // 구구단 계산 및 출력
//        for (int i = 1; i <= 9; i++) {
//            for (int j = 2; j <= 9; j++) {
//                System.out.print(j + "X" + i + "=" + (j * i) + "\t\t");
//            }
//            System.out.println();
//        }

//        // 10번 입력 받을 때마다 합계를 출력하시오.
//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i+"번째 숫자를 입력하세요.");
//            int num = scan.nextInt();
//            sum += num;
//        }
//        System.out.println("최종합 : "+sum);

//        // 1-100까지 홀수만 더해서 최종값을 출력하시오.
//        int sum = 0;
//        for (int i = 1; i <= 100; i++) {
//            if (i % 2 != 0) {
//                sum += i;
//            }
//        }
//        System.out.println(sum);

//        int sum = 0;
//        for (int i = 1; i <= 10; i++) {
//            sum = sum + i;
//            System.out.println("i : "+i);
//            System.out.println("sum : "+sum);
//        }
//        System.out.println("최종 sum : "+sum);
    }
}
