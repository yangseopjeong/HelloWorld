package Exception10;


public class Execptions {
// 객체 참조가 없는 오류
	public static void main(String[] args) {
//		nullPointerException 저장된 주소값이 null값인 주소 참조
		String exception = null;
		try {
			System.out.println(exception.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
		
//		ArrayIndexOutOfBoundsException: 배열을 벗어남
		int[] num = new int[4];
		try {
			System.out.println(num[4]);
		} catch (Exception e) {
			System.out.println(e);
		}	
//		NumberFormatException : 숫자로 못바꿔주는 경우
		String data1 = "50";
		String data2 = "70d";
		try {
			int result = Integer.parseInt(data1)+Integer.parseInt(data2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
//			예외처리에 상관없이 항상 실행해야 하는것 것
			System.out.println("Process again");
		}
		try {
			int[] array = new int[5];
			array[0]=20;
			array[1]=12;
			int result=array[0]/array[13];
			System.out.println("Result is   "+ result);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
//		 예비로 해놓는다.
		catch (Exception e) {
			System.out.println("개발자에게 문의해주세요");
		}

	}
	
		
}
