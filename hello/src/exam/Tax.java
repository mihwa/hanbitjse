
package exam;

import java.util.Scanner;

/**
 * @date :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file :Tax.java
 * @story :
 */
public class Tax {
	/**
	 * 클라이언트에서 프로그램 개발요청이 왔습니다
	 * 이름String name과 연봉int money을입력받아서
	 * 연봉***을 받으시는 xxx님께서 납부할 세금은 ??만원입니다 
	 * 로 출력하는 프로그램을 만들어 주세요
	 * 단)세율이 정책이 바뀔때마다 변하니
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요
	 * 현재는 double tax=0.097 이 9.7프로라고 합니다,
	 * 
	 * @param args
	 */
public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	int sal=0,money=0;
	System.out.println("이름");
	String name=scanner.next();
	System.out.println("연봉");
	sal=scanner.nextInt();
	double tax=0.097;
	money=(int) (sal*tax);
	System.out.println("연봉 "+sal+"만원을 받으시는 "+name+"님께서 "
			+ "납부할 세금은 "+tax+"원입니다");
	
	
	
	
	
	
}
}
