
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
	}

}
