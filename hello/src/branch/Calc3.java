/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :Calc.java
 * @story  :
*/
public class Calc3 {
/*�ΰ��� ������ �Է¹޾Ƽ�
 * opcode ����1�̸� ����
 * 2�� ����
 * *3�̸����
 * *4�� ������
 * 5�� ������ ���ϴ� ����
 */
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num1=0,num2=0,count=0,result=0;
		String symbol="";
		System.out.println("ù��°�����Է�:");
		num1=scanner.nextInt();
		System.out.println("�������Է�:");
		count=scanner.nextInt();
		System.out.println("�κ�°�����Է�");
		num2=scanner.nextInt();
		
	switch (count) {
	case 1:
		result=num1+num2;
		symbol="+";
		break;
		
	case 2:
		result=num1-num2;
		symbol="-";		
		break;
	case 3:
		result=num1*num2;
		symbol="*";
		break;
	case 4:
		result=num1/num2;
		symbol="/";
		break;
	case 5:
		result=num1%num2;
		symbol="%";
		
		break;

	default:
		
	System.out.println("1~5������ �Է¹ٶ��ϴ�");
		return;
		}
	System.out.println(num1+symbol+num2+"=");
	}
	
}
	

