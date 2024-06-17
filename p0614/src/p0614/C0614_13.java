package p0614;

import java.util.Scanner;

public class C0614_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        float pi = 3.141592f;
//        float shortPi = (int)(pi*1000)/1000f;
//        System.out.println(shortPi);

        // 입력한 숫자를 소수점 2자리 절사하시오.
        double input = scan.nextDouble();
//        double s_input = (int)(input*100)/100d; // 절사 floor()
//        double s_input = Math.round(input*100)/100d; // 반올림 round()
//        double s_input = Math.ceil(input*100)/100d; // 올림 ceil()
        double s_input = Math.floor(input*100)/100d; // 버림 floor()
        System.out.println(s_input);
    }
}
