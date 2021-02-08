package JavaProject;

import java.util.Iterator;
import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		//syso+^+space단축키
		System.out.print("점수를 입력해주세요:");
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		String result;
		if(score >=80) {
			result="합격";
		}
		else {
			result="불합격";
		}
		System.out.println(result+"입니다.");
		sc.close();
		
	}

}
// 금액을 입력해주세요>>
//오만원은 = 1장 일만원 = 몇 장 5천원은 몇장 ....십원까지
//금액과 수량을 입력받아 10개이상이면 20% 할인가를 적용해서 총매출액을 계산하는 프로그램