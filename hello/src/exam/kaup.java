/**
 * 
 */
package exam;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :kaup.java
 * @story  :ī��Ǫ���� ���ϴ� ���α׷�
*/
public class kaup {
/**
 * �����ڴ� ���α׷������Ƿ��Դϴ�
 * �������� ���ϴ� ���ε���
 * Ű�� �����Ը� �Է��ϸ� ����ڰ� ������ ��ü������ �˷��ִ�
 * ���α׷��� ����� �ּ���
 * ���� �Ա��߽��ϴ�.
 * ���� �𸣴µ� kaup����������ȴٰ� �ϳ׿�,������ ���������
 * �˾Ƽ��ϻ�....
 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name="",result="";//���̸�,���
				double weight=0,height=0,numResult=0;//������,Ű,������
				
				System.out.println("�̸�:");
				name=scanner.nextLine();
				System.out.println("ü��:");
				weight=scanner.nextInt();
				System.out.println("Ű:");
				height=scanner.nextInt();
				numResult=((weight/height)/100)/(height/100);//������
				
				if (numResult<18.5) {
					result="��ü��";
					
				}else if (numResult>18.4&&numResult<22.9) {
					result="����ü��";
					
				}else if (numResult>23&&numResult<24.9) {
				    result="����ü��";
					
				}else if (numResult>25&&numResult<29.9) {
					result="��1�ܰ�";
					
				}else if (numResult>30&&numResult<39.9) {
					result="��2�ܰ�";
				
				}else if (numResult>=40) {
					result="��3�ܰ�";
				}
	System.out.println(name+":Ű:"+height+"������:"+weight+   
			"Kaup����:"+numResult   +"���:"+result);
	
	}

	
}
	
