/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :Tax3.java
 * @story  :
*/
public class Tax3 {
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int sal=0,money=0;
	System.out.println("�̸�");
	String name=scanner.nextLine();
	System.out.println("����");
	sal=scanner.nextInt();
	double tax=0.097;
	money=(int) (sal*tax);
	System.out.println("����"+sal+"�� �����ô� "+name+"�Բ��� ������ ������ "+tax+"�����Դϴ�");
}
}		
