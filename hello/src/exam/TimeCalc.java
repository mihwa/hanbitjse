/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :TimeCalc.java
 * @story  :초를 가지고 시간 분 초로 환산하기
*/
public class TimeCalc {
/**
 * 개발자님..
 * 타이머로작업시간을 기록하고 있는데요
 * 결과가5000초로나오네요
 * 그런데 이게 감이 잘안와서요..
 * 시간,분,초로 나누어서 보게해주세요
 * 예를들면 5000초가 입력되면
 * 25시간 32분 15초 이렇게 보이게 해주세요
 * [출력] 25시간  32분  15초
 * 최초의초
 * hour=sec/60/60;
 * min=sec/60%60;
 * sec=sec%60;
 */
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int hour=0,min=0,sec=0,secInput=0;
		
		System.out.println("[출력]");
		System.out.println("입력초");
		secInput =scanner.nextInt();
		
		System.out.println("[출력]"+(secInput/3600)+"시간"+(secInput%3600/60)+"분"+(secInput%3600%60)+"초" );//120/60=2시간 ,121분 %60=1분
	}
	
}
