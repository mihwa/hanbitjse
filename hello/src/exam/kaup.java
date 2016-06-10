/**
 * 
 */
package exam;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :kaup.java
 * @story  :카우푸지수 구하는 프로그램
*/
public class kaup {
/**
 * 개발자님 프로그램제작의뢰입니다
 * 비만지수를 구하는 것인데요
 * 키와 몸무게를 입력하면 당사자가 비만인지 저체중인지 알려주는
 * 프로그램을 만들어 주세요
 * 돈은 입금했습니다.
 * 잘은 모르는데 kaup공식을쓰면된다고 하네요,공식은 나도몰라요
 * 알아서하삼....
 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name="",result="";//고객이름,결과
				double weight=0,height=0,numResult=0;//몸무게,키,비만지수
				
				System.out.println("이름:");
				name=scanner.nextLine();
				System.out.println("체중:");
				weight=scanner.nextInt();
				System.out.println("키:");
				height=scanner.nextInt();
				numResult=((weight/height)/100)/(height/100);//비만지수
				
				if (numResult<18.5) {
					result="저체중";
					
				}else if (numResult>18.4&&numResult<22.9) {
					result="정상체중";
					
				}else if (numResult>23&&numResult<24.9) {
				    result="위험체중";
					
				}else if (numResult>25&&numResult<29.9) {
					result="비만1단계";
					
				}else if (numResult>30&&numResult<39.9) {
					result="비만2단계";
				
				}else if (numResult>=40) {
					result="비만3단계";
				}
	System.out.println(name+":키:"+height+"몸무게:"+weight+   
			"Kaup지수:"+numResult   +"결과:"+result);
	
	}

	
}
	
