/**
 * 
 */
package branch;

import java.util.Scanner;

/*
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :Avg3.java
 * @story  :
* �̸��� ��,��,�� ������������ �Է¹޾Ƽ�
* [ȫ�浿:����***��,���***��,����:F]
* ��)����� �Ҽ������ϴ� �����մϴ�
* ��������� 90�� �̻�A
* 80�� �̻��̸�B
* 70���̻��̸�C
* 60���̻��̸� D
* 50�� �̻��̸�E
* 50�� �̸��̸� F�����Դϴ�
* ��µǰ����ּ���*/


public class Avg3 {
public static void main(String[] args) {
	String name="",result="";
	int total=0,aver=0,kor=0,eng=0,math=0,point=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("�̸�");
	name=scanner.nextLine();
	System.out.println("����");
	kor=scanner.nextInt();
	if (kor<0||kor>100) {
		System.out.println("0~100�������Է����ּ���");
		return;
	}
	System.out.println("����");
	eng=scanner.nextInt();
	if (eng<0||eng>100) {
		System.out.println("0~100�������Է����ּ���");
		return;
	}
	System.out.println("����");
	math=scanner.nextInt();
	if (math<0||math>100) {
		System.out.println("0~100�������Է����ּ���");
		return;
	}
	total=kor+eng+math;
	aver=total/3;
	
	if (aver>=90) {
		result="A";
	}else if (aver>=80) {
		result="B";
	}else if (aver>=70) {
		result="C";
	}else if (aver>=60) {
		result="D";
	}else if (aver>=50) {
		result="E";
	}else if (aver<50) {
		result="F";
	}
	System.out.println("["+name+":����"+total+"��,���"+aver+"��,����:"+result); 
		
	}
}
