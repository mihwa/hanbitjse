/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :TimeCalc.java
 * @story  :�ʸ� ������ �ð� �� �ʷ� ȯ���ϱ�
*/
public class TimeCalc {
/**
 * �����ڴ�..
 * Ÿ�̸ӷ��۾��ð��� ����ϰ� �ִµ���
 * �����5000�ʷγ����׿�
 * �׷��� �̰� ���� �߾ȿͼ���..
 * �ð�,��,�ʷ� ����� �������ּ���
 * ������� 5000�ʰ� �ԷµǸ�
 * 25�ð� 32�� 15�� �̷��� ���̰� ���ּ���
 * [���] 25�ð�  32��  15��
 * ��������
 * hour=sec/60/60;
 * min=sec/60%60;
 * sec=sec%60;
 */
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int hour=0,min=0,sec=0,secInput=0;
		
		System.out.println("[���]");
		System.out.println("�Է���");
		secInput =scanner.nextInt();
		
		System.out.println("[���]"+(secInput/3600)+"�ð�"+(secInput%3600/60)+"��"+(secInput%3600%60)+"��" );//120/60=2�ð� ,121�� %60=1��
	}
	
}
