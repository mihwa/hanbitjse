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
 public class Avg2 {
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
			System.err.println("0~100���� ������ �Է����ּ���");
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
		if (aver>90) {
			result="A";
			
		}else if (aver>80) {
			result="B";
		}else if (aver>70) {
			result="C";
		}else if (aver>60) {
			result="D";
		}else if (aver>50) {
			result="E";
		}else if (aver<50) {
			result="F";
		}
		
	System.out.println("["+name+":����"+total+"��,���"+aver+"��,����:"+result);
	}

}
