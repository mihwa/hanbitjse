/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :Num1.java
 * @story  :
*/
public class Num1 {
/**
 * 저희 반은 학생수가 3명입니다
 * 학생의 평균점수는 0~100점 사이입니다
 * 3명의 평균점수를 입력하면
 * =========
 * 1등홍길동
 * 2등김유신
 * 3등김구
 * 이렇게나오도록 해주세요
 * 단,학생이름은 스캐너로 입력받습니다
 * =========
 *  홍길동 49
 *  김유신 78
 *  김구 96
 *  1등 김구 96점
 *  2등 김유신 78점
 *  3등 홍길동 49점
 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String S1="",S2="",S3="";
		int score1=0,score2=0,score3=0;
		
		System.out.println("S1:");
		S1=scan.nextLine();
		System.out.println("S2:");
		S2=scan.next();
		System.out.println("S3:");
		S3=scan.next();
		
		
		if (S1.equals("")||S2.equals("")||S3.equals("")) {
			System.out.println("학생이름전부기재");
			return;
		}		
	
				System.out.println(S1+"학생의평균점수입력:");
				score1=scan.nextInt();
				if (score1>100||score1<0) {
					System.out.println("점수는0~100까지 입력가능");
					return;
				}
				System.out.println(S2+"학생의평균점수입력:");
				score2=scan.nextInt();
				if (score2>100||score2<0) {
					System.out.println("점수는0~100까지 입력가능");return;
					
				}
				System.out.println(S3+"학생의 평균점수입력:");
				score3=scan.nextInt();
				if (score3>100||score2<0) {
					System.out.println("점수는0~100까지입력가능");
					return;
				}
				String one="",two="",three="";
				if (score1>score2 && score1>score3) {
					one=S1;
					if (score2>score3) {
						two=S2;
						three=S3;
					}else{
						two=S3;
						three=S2;
					}
					
				}else if (score2>score1 && score2>score3) {
				one=S2;
				if (score1>score3) {
					two=S1;
					three=S3;
				}else   {
					two=S2;
							three=S1;
					
				}
						
				}
			
				
	}
	
}
