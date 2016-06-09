package hi;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :VarEx5.java
 * @story  :정수타입 double 빼기 예제
*/
public class VarEx5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double x=0.0,y=0.0,z=0.0;
		System.out.println("실수x입력");
		 x = scanner.nextDouble();
		System.out.println("실수y입력");
         y = scanner.nextDouble();
         z = x - y;
        System.out.println("x-y="+z);
	}
}
