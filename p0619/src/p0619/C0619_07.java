package p0619;

import java.util.Scanner;

public class C0619_07 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = (int)(Math.random()*100)+1;
		int input = 0; // 입력받을 값
		int count = 0; // 도전 횟수

		while(true) {
			System.out.println("숫자를 입력하세요(-1 : 종료) : ");
			String str = scan.nextLine();

			try {
				input = Integer.parseInt(str);
			} catch (NumberFormatException e) {
				System.out.println("숫자를 입력하세요.");
				continue;
			}

			count++;

			if(input == -1) {
				System.out.println("프로그램 종료");
				break;
			}

			if (num > input) {
				System.out.println("더 큰 수를 입력하세요");
			} else if (num < input) {
				System.out.println("더 작은 수를 입력하세요");
			} else {
				System.out.println("정답입니다.");
				break;
			}
		} // while

		scan.close();
		System.out.println("총 도전 횟수: " + count);
	} // main

} // class


//package p0619;
//
//import java.util.Scanner;
//
//import javax.swing.JOptionPane;
//
//public class C0619_07 {
//
//	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int num = (int)(Math.random()*100)+1;
//		int input = 0; // 입력받을 값
//		int count = 0; // 도전 횟수
//
//		while(true) {
//			System.out.println("숫자 입력");
//			input = scan.nextInt();
////			String str = JOptionPane.showInputDialog("숫자를 입력하세요(-1 : 종료) : ");
//			count++;
//
//			input = Integer.parseInt(str);
//
//			if(input == -1) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//
//			if (num > input) {
//				System.out.println("더 큰 수를 입력하세요");
//			}else if(num<input) {
//				System.out.println("더 작은 수를 입력하세요");
//			}else {
//				System.out.println("정답입니다.");
//				break;
//			}
//
//
//		} // while
//
//	} // main
//
//} // class
