/**
 * 
 */
package branch;

import java.util.Scanner;

/*
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :Avg3.java
 * @story  :
* 이름과 국,영,수 세과목점수를 입력받아서
* [홍길동:총점***점,평균***점,학점:F]
* 단)평균은 소수점이하는 절삭합니다
* 평균점수가 90점 이상A
* 80점 이상이면B
* 70점이상이면C
* 60점이상이면 D
* 50점 이상이면E
* 50점 미만이면 F학점입니다
* 출력되게해주세요*/


public class Avg3 {
public static void main(String[] args) {
	String name="",result="";
	int total=0,aver=0,kor=0,eng=0,math=0,point=0;
	Scanner scanner=new Scanner(System.in);
	System.out.println("이름");
	name=scanner.nextLine();
	System.out.println("국어");
	kor=scanner.nextInt();
	if (kor<0||kor>100) {
		System.out.println("0~100점수만입력해주세요");
		return;
	}
	System.out.println("영어");
	eng=scanner.nextInt();
	if (eng<0||eng>100) {
		System.out.println("0~100점수만입력해주세요");
		return;
	}
	System.out.println("수학");
	math=scanner.nextInt();
	if (math<0||math>100) {
		System.out.println("0~100점수만입력해주세요");
		return;
	}
	total=kor+eng+math;
	aver=total/3;
	
	if (aver>=90) {
		result="A";
	}else if (aver>=80) {
		result="B";
	}else if (aver>=70) {
		result="C";
	}else if (aver>=60) {
		result="D";
	}else if (aver>=50) {
		result="E";
	}else if (aver<50) {
		result="F";
	}
	System.out.println("["+name+":총점"+total+"점,평균"+aver+"점,학점:"+result); 
		
	}
}
