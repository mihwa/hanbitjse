package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :Test.java
 * @story  :
*/
	/*이름과 국,양,수 세과목점수를 입력받아서
	홍길동:촘점***점,평균***점
	*을 출력하는 프로그램
	*평균은 소수점이하는 절삭*/
	
public class Test {

public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
	String name = "";
	int kor=0,eng=0,math=0,total=0,aver=0;
	
	System.out.println("이름");
	name=scanner.nextLine();
	System.out.println("국어");
	kor =scanner.nextInt();
	System.out.println("영어");
	eng =scanner.nextInt();
	System.out.println("수학");
	math =scanner.nextInt();
	total=kor+eng+math;
	aver=total/3;
	System.out.println("");
	
	
	
}
}
