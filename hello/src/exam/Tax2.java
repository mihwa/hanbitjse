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
		System.out.println("이름");
		String name= scanner.nextLine();
		System.out.println("연봉");
		int sal=scanner.nextInt();
		double tax=0.097;
        int money = (int) (sal*tax);
        System.out.println("연봉"+sal+"을 받으시는 "+name+"님께서 납부할 세금은 "+tax+"원입니다");
        
        
		
	}
}
