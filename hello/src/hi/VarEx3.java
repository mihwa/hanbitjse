package hi;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :VarEx3.java
 * @story  :정수타입 int나누기예제
*/
public class VarEx3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int x=0,y=0,z=0;
	System.out.println("정수 x 입력");
	 x = scanner.nextInt();
	System.out.println("정수y 입력");
	 y = scanner.nextInt();
	 z = x/y;
	System.out.println("x/y="+z);
	
}
}
