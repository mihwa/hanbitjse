/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :Tax2.java
 * @story  :
*/
public class Tax2 {
	
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("�̸�");
		String name= scanner.nextLine();
		System.out.println("����");
		int sal=scanner.nextInt();
		double tax=0.097;
        int money = (int) (sal*tax);
        System.out.println("����"+sal+"�� �����ô� "+name+"�Բ��� ������ ������ "+tax+"���Դϴ�");
        
        
		
	}
}
