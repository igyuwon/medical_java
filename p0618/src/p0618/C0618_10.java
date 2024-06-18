package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_10 {
    public static void main(String[] args) {
        // 1-100까지 랜덤 숫자를 생성해서, 랜덤숫자를 맞추는 프로그램을 구현하시오.
        // 숫자를 입력해서 큰 수를 입력하세요. 작은 수를 입력하세요.
        // 10번까지만 입력가능하도록 구현
        Scanner scan = new Scanner(System.in);

        int r_num = (int)(Math.random() * 100) + 1;
        int [] input = new int[10];
        int count = 0;
        int result = 0;
        System.out.println(r_num);
        while (count<10){
            System.out.print(count+"번째 숫자를 입력하세요 : ");
            int num = scan.nextInt();
            // 유효값 확인
            if (num<1 || num>100){
                System.out.println("1~100까지의 숫자만 입력하세요.");
                continue;
            }
            input[count] = num;
            count++;

            if (num < r_num){
                System.out.println(num+"보다 큰 수를 입력하세요.");
            }
            else if (num > r_num){
                System.out.println(num+"보다 작은 수를 입력하세요.");
            }
            else{
                System.out.println(num+" 정답입니다.");
                break;
            }
        }
        System.out.println("랜덤 번호 : "+r_num);
        System.out.print("입력 번호 : ");
        for (int j=0;j<count;j++){
            System.out.print(input[j]+" ");
        }
        System.out.println();

        // 정답이 없을 때 가장 근사치의 값을 출력시켜보세요.
        // Math.abs(r_num - input[0]) : 절대값
        if (count == 10) {
            int[] no = new int[10];
            for (int i = 0; i < 10; i++) {
                no[i] = Math.abs(r_num - input[i]);
            }

            int minDiff = no[0];
            for (int i = 1; i < 10; i++) {
                if (no[i] < minDiff) {
                    minDiff = no[i];
                }
            }

            // 근사치 값을 출력
            System.out.print("근사치 값 : ");
            for (int i = 0; i < 10; i++) {
                if (no[i] == minDiff) {
                    System.out.print(input[i] + " ");
                }
            }
            System.out.println();

            // 차이 값 출력
            System.out.print("차이 값 : ");
            for (int i = 0; i < 10; i++) {
                System.out.print(no[i] + " ");
            }
            System.out.println();
        }
//////////////쌤이 한거
//        if(count==10) {
//            int[] no = new int[10]; //배열생성
//            for(int i=0;i<10;i++) { // 랜덤값 입력한 값을 뺄셈을 해줌.
//                no[i] = Math.abs(r_num - input[i]);
//            }
//
//            arr_no = 0;
//            temp = no[0];
//            for(int i = 1; i<10;i++) {
//                if(temp>=no[i]) {
//                    arr_no = i;
//                    temp = no[i];
//                }
//            }
//
//            System.out.println("근사치 값 1개 : "+input[arr_no]);
//
//
//
//            System.out.print("근사치 값 : ");
//            for(int i=0;i<10;i++) {
//                System.out.print(no[i]+" ");
//            }
//            System.out.println();
//        }

    }
}

