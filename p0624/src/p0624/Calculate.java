package p0624;

import java.util.Scanner;

public class Calculate {
    Scanner scan = new Scanner(System.in);
    // 메소드 1개를 사용해서 처리하는 방법
    void change(int[] score) {
        System.out.println("변경 국어점수를 입력하세요 : ");
        score[0] = scan.nextInt();

        System.out.println("변경 영어점수를 입력하세요 : ");
        score[1] = scan.nextInt();

        System.out.println("변경 수학점수를 입력하세요 : ");
        score[2] = scan.nextInt();

    }
//    void change(int kor, int eng, int math) {
//        System.out.println("변경 국어점수를 입력하세요 : ");
//        kor = scan.nextInt();
//
//        System.out.println("변경 영어점수를 입력하세요 : ");
//        eng = scan.nextInt();
//
//        System.out.println("변경 수학점수를 입력하세요 : ");
//        math = scan.nextInt();
//
//    }
//    int korChange(int kor){
//        System.out.println("변경 국어점수를 입력하세요 : ");
//        kor = scan.nextInt();
//        return kor;
//    }
//    int engChange(int eng){
//        System.out.println("변경 영어점수를 입력하세요 : ");
//        eng = scan.nextInt();
//        return eng;
//    }
//    int mathChange(int math){
//        System.out.println("변경 수학점수를 입력하세요 : ");
//        math = scan.nextInt();
//        return math;
//    }
    int result = 0;
    // cal()
    // return result;
    int cal(int[] arr, String str) {
        switch (str){
            case "+":
                result = arr[0] + arr[1];
                break;
            case "-":
                result = arr[0] - arr[1];
                break;
            case "*":
                result = arr[0] * arr[1];
                break;
            case "/":
                result = arr[0] / arr[1];
                break;

        }
        return result;
    }
}
