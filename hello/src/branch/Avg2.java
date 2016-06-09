package branch;

import java.util.Scanner;

/* @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :Avg2.java
 * @story  :학점내기//
 
 * 이름과 국,영,수 세과목점수를 입력받아서
 * [홍길동:총점***점,평균***점,학점:F]
 * 단)평균은 소수점이하는 절삭합니다
 * 평균점수가 90점 이상A
 * 80점 이상이면B
 * 70점이상이면C
 * 60점이상이면 D
 * 50점 이상이면E
 * 50점 미만이면 F학점입니다
 * 출력되게해주세요
*/
 public class Avg2 {
	 public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
				String name="",result="";
		int total=0,aver=0,kor=0,eng=0,math=0,point=0;
		
		System.out.println("이름");
		name=scan.nextLine();
		System.out.println("국어");
		kor=scan.nextInt();
		if (kor>100||kor<0) {
			System.out.println("0~100점의 점수만입력해주세요");
			return;
		}
		System.out.println("영어");
		eng=scan.nextInt();
		if (eng>100||eng<0) {
			System.err.println("0~100점의 점수만 입력해주세요");
			return;
		}
		System.out.println("수학");
		math=scan.nextInt();
		if (math>100||math<0) {
			System.out.println("0~100점의 점수만 입력해주세요");
			return;
		}
		total=kor+eng+math;
		aver=total/3;
		if (aver>90) {
			result="A";
			
		}else if (aver>80) {
			result="B";
		}else if (aver>70) {
			result="C";
		}else if (aver>60) {
			result="D";
		}else if (aver>50) {
			result="E";
		}else if (aver<50) {
			result="F";
		}
		
	System.out.println("["+name+":총점"+total+"점,평균"+aver+"점,학점:"+result);
	}

}
