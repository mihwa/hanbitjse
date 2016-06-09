package hi;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :VarEx8.java
 * @story  :실수예제 int
*/
public class VarEx8 {
 public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	int x=0,y=0,z=0;
	System.out.println("실수x입력");
	x=scanner.nextInt();
	System.out.println("실수y입력");
	y=scanner.nextInt();
	z=x*y;
	System.out.println("x*y="+z);
		
	
			}
}
