package JavaProject;

import java.util.Iterator;
import java.util.Scanner;

public class IfEx3 {

	public static void main(String[] args) {
		//syso+^+space����Ű
		System.out.print("������ �Է����ּ���:");
		Scanner sc = new Scanner(System.in);
		int score=sc.nextInt();
		String result;
		if(score >=80) {
			result="�հ�";
		}
		else {
			result="���հ�";
		}
		System.out.println(result+"�Դϴ�.");
		sc.close();
		
	}

}
// �ݾ��� �Է����ּ���>>
//�������� = 1�� �ϸ��� = �� �� 5õ���� ���� ....�ʿ�����
//�ݾװ� ������ �Է¹޾� 10���̻��̸� 20% ���ΰ��� �����ؼ� �Ѹ������ ����ϴ� ���α׷�