package hi;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :VarEx5.java
 * @story  :����Ÿ�� double ���� ����
*/
public class VarEx5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double x=0.0,y=0.0,z=0.0;
		System.out.println("�Ǽ�x�Է�");
		 x = scanner.nextDouble();
		System.out.println("�Ǽ�y�Է�");
         y = scanner.nextDouble();
         z = x - y;
        System.out.println("x-y="+z);
	}
}
