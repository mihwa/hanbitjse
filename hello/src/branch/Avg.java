
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :Avg.java
 * @story  :
*/
 /*/*�̸��� ��,��,�� ������������ �Է¹޾Ƽ�
	ȫ�浿:����***��,���***��,�հ�����(���հ�)]
	*�� ����ϴ� ���α׷�
	*����� �Ҽ������ϴ� ����*/


	
public class Avg {

public static void main(String[] args) {
	//--���������,�غ�,�ʱ�ȭ(init)--��--
	
	String name = "";
	int kor=0,eng=0,math=0,total=0,aver=0,pass=0;// �̸�,��,��,��,����,���,�հ�����(���հ�)
	String result="";
	Scanner scanner=new Scanner(System.in);
	//-------------------�����(�˰���)-CPU--------
	System.out.println("�̸�");
	name=scanner.nextLine();
	System.out.println("����");
	kor =scanner.nextInt();
	System.out.println("����");
	eng =scanner.nextInt();
	System.out.println("����");
	math =scanner.nextInt();
	total=kor+eng+math;
	aver=total/3;
	
	
	
	
	if (aver<60) {
		result="���հ�";
		
		
	}else{
		result="�հ�";
	}
	//----��º�(�ܼ�)
	System.out.println(name+":"+total+","+aver+",�հݿ���("+result+")");
	
	
	
	
	
	
}
}
