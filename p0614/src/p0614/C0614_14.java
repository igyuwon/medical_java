package p0614;

import java.util.Scanner;

public class C0614_14 {
    public static void main(String[] args) {
        // 입력한 숫자가 양수인지, 음수인지 출력하시오. 0은 양수로 출력하세요.
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        if(num>=0){
            System.out.println("양수");
        }else{
            System.out.print("음수");
        }
//        if(num%2==0){
//            System.out.println("짝수");
//        }else{
//            System.out.print("홀수");
//        }


//        int a = 10;
//        if(a==10){
//            System.out.println("10");
//        }else{
//            System.out.println("아님");
//        }

//        if (a > 0) {
//            System.out.println("양수");
//        }else {
//            System.out.println("음수");
//        }
    }
}
