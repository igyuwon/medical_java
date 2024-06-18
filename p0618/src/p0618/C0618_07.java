package p0618;

import java.util.Arrays;
import java.util.Scanner;

public class C0618_07 {

	public static void main(String[] args) {

		// 1. 45개의 ball 배열 생성 1~45 숫자 입력
		// 2. 6개의 myArr 배열을 만들어서 1~45까지 6개의 숫자 입력받아 출력
		Scanner scan = new Scanner(System.in);
		
		int [] ball = new int[45];
		int [] myArr = new int[6];
		int [] myLotto = new int[6];
		for (int i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		// 3. 랜덤으로 섞기
		int no = 0; // 랜덤 번호
		int t_value = 0; // 값을 저장
		
		for (int i=0; i<300; i++) {
			no = (int)(Math.random()*45); // 0~44
			t_value = ball[0];
			ball[0] = ball[no];
			ball[no] = t_value;
		}

		//----
		
		
		// 4. 내 로또 번호 입력
		int num = 0;
		int n = 0;
		while(n<6) {
			System.out.printf("%d번째 숫자를 입력하세요(1~45) : ",n+1);
			num = scan.nextInt();
			if (num<1 || num>45){
				System.out.println("1-45까지의 숫자만 입력하셔야합니다.");
				continue;
			}
			myArr[n] = num;
			n++;
		}

		// 입력한 숫자 출력
		System.out.print("입력한 숫자 : ");
		for(int i=0; i<myArr.length; i++) {
			System.out.print(myArr[i]+" ");
		} // 출력을 배열로 안하게 하기 위한 for 문구 myArr은 위에서 입력 받음
		System.out.println(); 
		
		
		// 5. 로또 번호 출력
		System.out.print("로또 번호 : ");
		for(int i=0; i<6; i++) {
			System.out.print(ball[i]+" ");
		}
		System.out.println();

		// 로또번호와 일치하는 번호
		int count = 0;
		for(int i=0; i<6; i++){
			for(int j = 0; j<6; j++){
				if(myArr[i] == ball[j]){
					myLotto[count] = myArr[i];
					count++;
					break;
				}
			}
		}
		System.out.println("로또 당첨개수 : "+count);

		// 당첨된 번호가 출력되도록 구현하시오.
		System.out.print("당첨된 번호 : ");
		for(int i=0; i<count; i++) {
			System.out.print(myLotto[i]+" ");
		}
		if (count==0) System.out.print("없음");
		System.out.println();

		// 당첨금액 : 6개-100억, 5개-2억, 4개-1백만원, 3개-1만원
		switch (count){
			case 3:
				System.out.println("1만원");
				break;
			case 4:
				System.out.println("1백만원");
				break;
			case 5:
				System.out.println("2억");
				break;
			case 6:
				System.out.println("100억");
				break;
			default:
				System.out.println("없음");
				break;
		}

//		System.out.println("로또 당첨번호 : "+Arrays.toString(myLotto));


		
		// 10개의 배열을 생성하고 숫자를 입력 받아서 3,4번째 숫자만 출력하기
//		int [] score = new int[10];
//		Scanner scan = new Scanner(System.in);
//		for (int i=0; i<score.length; i++) {
//			System.out.printf("%d번째 숫자 입력 :",i+1);
//			score[i] = scan.nextInt();
//		}
//		System.out.printf("3 : %d, 4 : %d \n",score[2],score[3]);

	} // main

} // class
