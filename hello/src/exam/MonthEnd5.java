/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :MonthEnd5.java
 * @story  :
*/
public class MonthEnd5 {

}/**
+	 * �����ڴ� ��,���� �Է��ϸ� ������ �������� �˷��ִ�
+	 * ���α׷��� ����� �ּ���.
+	 * ��, ���� 2���� 29�� �̰�, ������ �ش� 28�Ϸ� �����Դϴ�
+	 * 1~12�� ��� ���ڸ� �Է��ϸ�
+	 * �߸��� �Է°��Դϴ� ��� ���.
+	 * */
+	/**
+	 * ������ ����
+	 * ������ 4�� �������� 0�̶�� ������ �� �ִ�.
+	 * �׷��� �ش� ������ 100���� ���� �������� ����̴�.
+	 * 2000���� 4�� �������� 0�̶� ������ ������ �Ǵµ�
+	 * �ٽ� �� ���� 100���� ���� �������� ������ ����� �Ǿ���.
+	 * ����̶��ص� �ٽ� 400���� ������������ �⵵�� �����̴� 
+	 * year%4==10 year%100!=0 year%400==0 */
	public static void main(String[] args) {
		// --------init---------
		Scanner scanner = new Scanner(System.in);
		int malil=0; 
		//
		//---------op --------
		System.out.println("�� �Է�?(��)2016");
		int year=scanner.nextInt();
		System.out.println("�� �Է�?(��)2");
		int month =scanner.nextInt();
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			malil = 31;
			break;
		case 2:
			if(){
				
			}else{
				
			}//    ������ malil=(year%4==0&&year%100!=0||year%400==0)? 29: 28;//������=������ʵȴ�.?():;
			break;
		case 4:case 6:case 9:case 11:
			malil = 30;
			break;
		default:System.out.println("�߸� �Է� �Ǿ����ϴ�");
			return;
		}
		System.out.printf(year+"��"+month+"��"+malil+"��");//System.out.printf("%d%s%d%s��",year,"��",month,"��",malil,"��")}}
