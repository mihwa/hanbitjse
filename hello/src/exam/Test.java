package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :Test.java
 * @story  :
*/
	/*�̸��� ��,��,�� ������������ �Է¹޾Ƽ�
	ȫ�浿:����***��,���***��
	*�� ����ϴ� ���α׷�
	*����� �Ҽ������ϴ� ����*/
	
public class Test {

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String name = "";
	int kor=0,eng=0,math=0,total=0,aver=0;
	
	System.out.println("�̸�");
	name=scanner.nextLine();
	System.out.println("����");
	kor =scanner.nextInt();
	System.out.println("����");
	eng =scanner.nextInt();
	System.out.println("����");
	math =scanner.nextInt();
	total=kor+eng+math;
	aver=total/3;
	System.out.println("");
	
	
	
}
}
