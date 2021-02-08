package JavaProject;

public class OperationEx3 {

	public static void main(String[] args) {
//		byte num1=20,num2=30;
//		int result = num1+num2;
//		byte result = num1+num2; 쓰면 오류 실수형은 기본 double형으러 연산 정수는 int형으로 연산
		// <<(쉬프트)연산자 비트를 왼쪽으로 2비트 이동
//		int num1=8;
//		System.out.println(num1<<2);
		
		//복합대임 연산자 += -= *= ...
//		int  num1=10;
//		num1+=10;
//		System.out.println(num1<<2);
		
		//(조건식)? 변수1 또는 연산자(참 일때): 변수2 연산자(거짓일 때); 삼항 연산자
		int num1=20;
		int num2=50;
		int result=(num1>num2)? num1: num2;
		System.out.println(result);



	}

}
