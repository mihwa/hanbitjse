
package exam;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file :Tax.java
 * @story :
 */
public class Tax {
	/**
	 * Ŭ���̾�Ʈ���� ���α׷� ���߿�û�� �Խ��ϴ�
	 * �̸�String name�� ����int money���Է¹޾Ƽ�
	 * ����***�� �����ô� xxx�Բ��� ������ ������ ??�����Դϴ� 
	 * �� ����ϴ� ���α׷��� ����� �ּ���
	 * ��)������ ��å�� �ٲ𶧸��� ���ϴ�
	 * �����ڰ� ���� ���밡���ϵ��� ����� �ּ���
	 * ����� double tax=0.097 �� 9.7���ζ�� �մϴ�,
	 * 
	 * @param args
	 */
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int sal=0,money=0;
	System.out.println("�̸�");
	String name=scanner.next();
	System.out.println("����");
	sal=scanner.nextInt();
	double tax=0.097;
	money=(int) (sal*tax);
	System.out.println("���� "+sal+"������ �����ô� "+name+"�Բ��� "
			+ "������ ������ "+tax+"���Դϴ�");
	
	
	
	
	
	
}
}
