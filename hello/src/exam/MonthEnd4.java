/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :MonthEnd.java
 * @story  :
 */
public class MonthEnd4 {
	/**
	 *��,���� �Է��ϸ� ������ �������� �˷��ִ� 
	 *���α׷�
	 *��,���� 2���� 29���̰�, �������ش� 28�Ϸθ���
.	 *1~12�� ��� ���ڸ� �Է��ϸ� 
	 *�߸��� �Է°��Դϴ� ��� ��� 
	 *2���� ������ 29���Դϴ�
	 *����������
	 *������ 4�� �������� 0�̶�� ������ ���ִ�
	 *�׷��� �ش翬���� 100���� ������������ ����̴�
	 *2000���� 4�� ��������0�̶� ������ ������ �Ǵµ� �ٽ� �̰��� 100���� �����������⶧���� ����̵Ǿ���
	 *����̶��ص� �ٽ�400���� ������������ �⵵�� �����̴�
	 *2016/
	 **/

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String month="",day="";
System.out.println("�� �Է��ϼ���(��)2016-2");//car���� ����
		int year=2016;

System.out.println("�����Է�?");
	int month=2;
	
	
		String strYear=Integer.parseInt("2016");
		
		
		
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
		
		if (year==1) {
			end day=29;
		} else {
end day =28;
		}

		default:System.out.println("1~12�� ��� ���ڸ� �Է��ϸ� �߸��� �Է°��̶����");
		}

		System.out.println(year+"��"+month+"��"+endday+"��");//



	}

}
