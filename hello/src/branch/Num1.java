/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :Num1.java
 * @story  :
*/
public class Num1 {
/**
 * ���� ���� �л����� 3���Դϴ�
 * �л��� ��������� 0~100�� �����Դϴ�
 * 3���� ��������� �Է��ϸ�
 * =========
 * 1��ȫ�浿
 * 2�������
 * 3��豸
 * �̷��Գ������� ���ּ���
 * ��,�л��̸��� ��ĳ�ʷ� �Է¹޽��ϴ�
 * =========
 *  ȫ�浿 49
 *  ������ 78
 *  �豸 96
 *  1�� �豸 96��
 *  2�� ������ 78��
 *  3�� ȫ�浿 49��
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S1="",S2="",S3="";
		int score1=0,score2=0,score3=0;
		
		System.out.println("S1:");
		S1=scan.nextLine();
		System.out.println("S2:");
		S2=scan.next();
		System.out.println("S3:");
		S3=scan.next();
		
		
		if (S1.equals("")||S2.equals("")||S3.equals("")) {
			System.out.println("�л��̸����α���");
			return;
		}		
	
				System.out.println(S1+"�л�����������Է�:");
				score1=scan.nextInt();
				if (score1>100||score1<0) {
					System.out.println("������0~100���� �Է°���");
					return;
				}
				System.out.println(S2+"�л�����������Է�:");
				score2=scan.nextInt();
				if (score2>100||score2<0) {
					System.out.println("������0~100���� �Է°���");return;
					
				}
				System.out.println(S3+"�л��� ��������Է�:");
				score3=scan.nextInt();
				if (score3>100||score2<0) {
					System.out.println("������0~100�����Է°���");
					return;
				}
				String one="",two="",three="";
				if (score1>score2 && score1>score3) {
					one=S1;
					if (score2>score3) {
						two=S2;
						three=S3;
					}else{
						two=S3;
						three=S2;
					}
					
				}else if (score2>score1 && score2>score3) {
				one=S2;
				if (score1>score3) {
					two=S1;
					three=S3;
				}else   {
					two=S2;
							three=S1;
					
				}
						
				}
			
				
	}
	
}
