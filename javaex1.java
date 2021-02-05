
public class javaex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double double_num = 1.2;
//		int int_num=double_num; 오류 발생
		int int_num =(int)double_num;
		System.out.println(int_num);
		//소수점 아래 제거
		int int_num2 =1200;
		byte byte_num= (byte)int_num2;
		System.out.println(byte_num);
		//바이트를 잘라서 1바이트 잘라서 저장하기 때문에 값이 다르게 바뀔수도 있다
		// 그럼으로 다음과 같이 if문을 사용해 바이트가 될수없는 수를 걸러낸다.
		if(int_num2<Byte.MIN_VALUE||int_num2>Byte.MAX_VALUE) {
			System.out.println("바꿀수 없는 값");
		}
		else {
			byte_num= (byte)int_num2;
			System.out.println(byte_num);
		}
	}

}

//실행시 콘솔 창
// 1
// -80
// 바꿀수 없는 값
