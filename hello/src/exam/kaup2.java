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
 * @story  :ī��Ǫ���� �ϼ�
*/
public class kaup2 {
	/**
	 * �����ڴ�BMI������ �ʹ�����
	 * �Ҽ�������2�ڸ����������ּ���
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name="",result="";
		double bmi=0.0,height=0.0,weight=0.0,kaup=0.0;
		
		//----op
	System.out.println("�̸�?");
	name=scanner.next();
	
	System.out.println("Ű?");
	height=scanner.nextDouble();
	
	System.out.println("������?");
	weight=scanner.nextDouble();
	
	
	kaup=((weight/height)/100)/(height/100);

		
		//
	if (kaup<18.5) {
		result="��ü��";
		
	}else if (kaup>18.4 && kaup<23) {
		result="����ü��";
		
	}else if (kaup>23 && kaup<25) {
	    result="����ü��";
		
	}else if (kaup>25&&kaup<30) {
		result="��1�ܰ�";
		
	}else if (kaup>30&&kaup<40) {
		result="��2�ܰ�";
	
	}else if (kaup>=40) {
		result="��3�ܰ�";
	}
	
		System.out.println(name+"�� BMI������ "+Double.parseDouble(String.format("%.2f", bmi)+"�̰�,"+result));
	}
		
	}

