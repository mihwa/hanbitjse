package branch;

import java.util.Scanner;

/* @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :Avg2.java
 * @story  :��������//

 * �̸��� ��,��,�� ������������ �Է¹޾Ƽ�
 * [ȫ�浿:����***��,���***��,����:F]
 * ��)����� �Ҽ������ϴ� �����մϴ�
 * ��������� 90�� �̻�A
 * 80�� �̻��̸�B
 * 70���̻��̸�C
 * 60���̻��̸� D
 * 50�� �̻��̸�E
 * 50�� �̸��̸� F�����Դϴ�
 * ��µǰ����ּ���
 */

public class Avg4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String name="",result="";
		int total=0,aver=0,kor=0,eng=0,math=0,point=0;

		System.out.println("�̸�");
		name=scan.nextLine();
		System.out.println("����");
		kor=scan.nextInt();
		if (kor>100||kor<0) {
			System.out.println("0~100���� �������Է����ּ���");
			return;
		}
		System.out.println("����");
		eng=scan.nextInt();
		if (eng>100||eng<0) {
			System.out.println();			
			return;
		}
		System.out.println("����");
		math=scan.nextInt();
		if (math>100||math<0) {
			System.out.println("0~100���� ������ �Է����ּ���");
			return;
		}
		total=kor+eng+math;
		aver=total/3;
		
		switch (aver) {
		case 10: case 9:
			result="A";break;
					
		case 8: result="B";break;
				
		case 7: result="C";break;
			
		case 6: result="D";break;
		
		case 5: result="E";break;
			
		case 4:case 3:case 2:case 1:case 0: result="F";break;
		
		default:
			break;
		}
		System.out.println("["+name+":����"+total+"��,���"+aver+"��,����:"+result);
	}
	
}





