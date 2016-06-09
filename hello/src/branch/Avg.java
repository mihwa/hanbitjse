
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :Avg.java
 * @story  :
*/
 /*/*이름과 국,영,수 세과목점수를 입력받아서
	홍길동:촘점***점,평균***점,합격점수(불합격)]
	*을 출력하는 프로그램
	*평균은 소수점이하는 절삭*/


	
public class Avg {

public static void main(String[] args) {
	//--변수선언부,준비,초기화(init)--램--
	
	String name = "";
	int kor=0,eng=0,math=0,total=0,aver=0,pass=0;// 이름,국,영,수,총점,평균,합격점수(불합격)
	String result="";
	Scanner scanner=new Scanner(System.in);
	//-------------------연산부(알고리즘)-CPU--------
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
	
	
	
	
	if (aver<60) {
		result="불합격";
		
		
	}else{
		result="합격";
	}
	//----출력부(콘솔)
	System.out.println(name+":"+total+","+aver+",합격여부("+result+")");
	
	
	
	
	
	
}
}
