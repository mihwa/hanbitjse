/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :tax2.java
 * @story  :
*/
public class tax2 {

	/* ����***�� �����ô� xxx�Բ��� ������ ������ ??�����Դϴ� 
			 * �� ����ϴ� ���α׷��� ����� �ּ���
			 * ��)������ ��å�� �ٲ𶧸��� ���ϴ�
			 * �����ڰ� ���� ���밡���ϵ��� ����� �ּ���
			 * ����� ������ 9.7���ζ�� �մϴ�,
			 *�ٲ＼���� ����ٶ��ϴ�*/
			 
			
				
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int sal=0,money=0,tax=0;
		
			
			System.out.println("�̸�");
			String name=scanner.next();
			System.out.println("����");
			sal=scanner.nextInt();
			System.out.println("������ �ٲ�����ϱ�? �״�θ�1 ,�ٲ������2�� �Է��ϼ���");
			int count=scanner.nextInt();
			
			
			if (count==1) {
				 //System.out.println("���� "+sal+"������ �����ô� "+name+"�Բ��� "
				//			+ "������ ������ "+tax+"���Դϴ�");
				System.out.println("�����Ҽ�����"+tax+"���Դϴ�");
			} else {
				System.out.println("�׷�,�ٲ＼���� �Է¹ٶ��ϴ�");
				double tax2=scanner.nextDouble();
				System.out.println("�����Ҽ�����"+tax2+"���Դϴ�");
			}
			
}
}