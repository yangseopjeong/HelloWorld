package Exception10;


public class Execptions {
// ��ü ������ ���� ����
	public static void main(String[] args) {
//		nullPointerException ����� �ּҰ��� null���� �ּ� ����
		String exception = null;
		try {
			System.out.println(exception.toString());
		} catch (Exception e) {
			System.out.println(e);
		}
		
//		ArrayIndexOutOfBoundsException: �迭�� ���
		int[] num = new int[4];
		try {
			System.out.println(num[4]);
		} catch (Exception e) {
			System.out.println(e);
		}	
//		NumberFormatException : ���ڷ� ���ٲ��ִ� ���
		String data1 = "50";
		String data2 = "70d";
		try {
			int result = Integer.parseInt(data1)+Integer.parseInt(data2);
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
//			����ó���� ������� �׻� �����ؾ� �ϴ°� ��
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
//		 ����� �س��´�.
		catch (Exception e) {
			System.out.println("�����ڿ��� �������ּ���");
		}

	}
	
		
}
