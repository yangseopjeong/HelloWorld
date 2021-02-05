
public class OperationEx1 {

	public static void main(String[] args) {
		int num1=1;
		int num2=3;
		int num3=5;
		int result=num1+num2+num3;
		System.out.println("결과값:"+result);
		//예제
		int apple=83;
		int child = 12;
		int apple_one=apple/child;
		int apple_remain = apple%child;
		System.out.println("한사람당 배급된 사과수:"+apple_one+"\n남은 사과수:"+ apple_remain);
		// 증감 연산자
		int num =1;
		System.out.println(num++);
		System.out.println(++num);
		//부정연산자
		boolean tf=true;
		tf = !tf;
		System.out.println(tf);
	}

}



// 결과 콘솔창
// 결과값:9
// 한사람당 배급된 사과수:6
// 남은 사과수:11
//1
//3
//false


