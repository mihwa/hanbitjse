/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :MonthEnd.java
 * @story  :
 */
public class MonthEnd {
	/**
	 *�����Է��ϸ� ������ �������� �˷��ִ� 
	 *���α׷�
	 *��,2���� 29�Ϸ�������
	 *1~12�� ��� ���ڸ� �Է��ϸ� �߸��� �Է°��Դϴ� ��� ��� 
	 *2���� ������ 29���Դϴ�
	 **/

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String month="",day="";

		System.out.println("�����Է�");
		month=scanner.nextLine();

		switch (month) {
		case "1":day="31";break;
		case "3":day="31";break;
		case "5":day="31";break;
		case "7":day="31";break;
		
		case "2":day="29";break;
		case "4":day="30";break;
		
		case "6":day="30";break;
		
		case "8":day="31";break;
		case "9":day="30";break;
		case "10":day="31";break;
		case "11":day="30";break;
		case "12":day="31";break;

		default:System.out.println("1~12�� ��� ���ڸ� �Է��ϸ� �߸��� �Է°��̶����");
		}

		System.out.println(month+"���Ǹ�����"+day);//2���� ������ 29���Դϴ�



	}

}
