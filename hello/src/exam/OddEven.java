/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :OddEven.java
 * @story  :
*/
public class OddEven {
/**
 *�����ڴ�,Ȧ¦�����ϳ� ������ּ���
 *����ڰ� Ȧ����¦���� ���߸� WIN
 *Ʋ���� LOOSE�� ��µǸ� �˴ϴ�
 * (����ڰ��𸣴� ������ ����Ѵ�)
 * 
 */
public static void main(String[] args) {
		
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		
	int num=random.nextInt(10)+1;//������ �����ְ������ /10.999�̹Ƿ�
	int userNum=scanner.nextInt();
	String result="Loose";
	int num=0,choose=0;
	
	System.out.println("Ȧ¦����");
	System.out.println("Ȧ�̸�0,¦�̸�1�� �Է�:");
	choose=scanner.nextInt();
	
	if (choose) {
	
	
	
	switch(choose);
	case 0:
	result="WIN";break;
	case 1:
	result="Loose";break;
		
	
	
	
System.out.println("���� �Žôµ� ¦�̶�� �����ϸ�0��" +"Ȧ�̶�� �����ϸ� 1�� �Է��Ͻÿ�");//Ȧ�̸�0,¦�̸�1�� �Է� 5 0��1�������ϳ��� �Է��ϼ���

	System.out.println("WIN");
	
	
	
}
}
	//
	
	
	

