package hi;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :VarEx3.java
 * @story  :����Ÿ�� int�����⿹��
*/
public class VarEx3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int x=0,y=0,z=0;
	System.out.println("���� x �Է�");
	 x = scanner.nextInt();
	System.out.println("����y �Է�");
	 y = scanner.nextInt();
	 z = x/y;
	System.out.println("x/y="+z);
	
}
}
