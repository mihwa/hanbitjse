/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :tax2.java
 * @story  :
*/
public class tax2 {

	/* 연봉***을 받으시는 xxx님께서 납부할 세금은 ??만원입니다 
			 * 로 출력하는 프로그램을 만들어 주세요
			 * 단)세율이 정책이 바뀔때마다 변하니
			 * 관리자가 쉽게 적용가능하도록 만들어 주세요
			 * 현재는 세율리 9.7프로라고 합니다,
			 *바뀐세율을 적용바랍니다*/
			 
			
				
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			int sal=0,money=0,tax=0;
		
			
			System.out.println("이름");
			String name=scanner.next();
			System.out.println("연봉");
			sal=scanner.nextInt();
			System.out.println("세율이 바뀌었습니까? 그대로면1 ,바뀌었으면2를 입력하세요");
			int count=scanner.nextInt();
			
			
			if (count==1) {
				 //System.out.println("연봉 "+sal+"만원을 받으시는 "+name+"님께서 "
				//			+ "납부할 세금은 "+tax+"원입니다");
				System.out.println("납부할세금은"+tax+"원입니다");
			} else {
				System.out.println("그럼,바뀐세율을 입력바랍니다");
				double tax2=scanner.nextDouble();
				System.out.println("납부할세금은"+tax2+"원입니다");
			}
			
}
}