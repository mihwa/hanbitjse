/**
 * 
 */
package exam;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :Gender.java
 * @story  :
*/
public class Gender2 {
/**
 * �����ڴ� ���� ����Ʈ�� �ֹι�ȣ ���ڸ��� ����
 * �Ǻ���ȣ�� �Է��մϴ�
 * ������� 800101-1������ �Է��ϸ�
 * �Һ��ڰ� �ڽ��� �������� �������� ������ �ʾƵ�
 * �ڵ������� DB������Ǵ� �ý����� �������ּ���
 * [��¹�] ȫ�浿(��),������(��)
 */
	/*		
	1,2 : ���� 1900���� ��,��
	3,4 : ���� 2000���� ��,��
	5,6 : �ܱ� 1900���� ��,��
	7,8 : �ܱ� 2000���� ��,��		
	*/
	public static void main(String[] args) {
		//---initial---
	Scanner scanner=new Scanner(System.in);	
		String snn="",name="",gender="";

	//------oop---
		System.out.println("�̸� :");
	name=scanner.nextLine();
	System.out.println("snn�Է�");
		snn=scanner.next();
		System.out.println("����");
	
		char c =snn.charAt(7);
	
	
	if (c=='0'||c=='9') {
		System.out.println("�ֹε�Ϲ�ȣ�� 0,9�� �ԷºҰ�");
	return;//�ý��۲������.��
	
	}		
	switch (c) {
	case '1':case '3':case '5':case'7':gender="��";break;
	case'2':case'4':case'6':case'8':gender="��";break;
//swich(c%2) -upcasting=:�������� ū����/ downcasting:�������� ū����
	
default:
	break;
	
		}System.out.println("[��¹�]"+name+"("+gender+")");//[��¹�] ȫ�浿(��),������(��)
	}
}
