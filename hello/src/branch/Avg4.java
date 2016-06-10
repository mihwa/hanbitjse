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

public class Avg4 {
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
			System.out.println();			
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
		
		switch (aver) {
		case 10: case 9:
			result="A";break;
					
		case 8: result="B";break;
				
		case 7: result="C";break;
			
		case 6: result="D";break;
		
		case 5: result="E";break;
			
		case 4:case 3:case 2:case 1:case 0: result="F";break;
		
		default:
			break;
		}
		System.out.println("["+name+":총점"+total+"점,평균"+aver+"점,학점:"+result);
	}
	
}





