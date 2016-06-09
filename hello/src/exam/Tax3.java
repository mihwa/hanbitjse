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
	System.out.println("이름");
	String name=scanner.nextLine();
	System.out.println("연봉");
	sal=scanner.nextInt();
	double tax=0.097;
	money=(int) (sal*tax);
	System.out.println("연봉"+sal+"을 받으시는 "+name+"님께서 납부할 세금은 "+tax+"만원입니다");
}
}		
