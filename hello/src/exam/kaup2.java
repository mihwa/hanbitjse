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
 * @story  :카우푸지수 완성
*/
public class kaup2 {
	/**
	 * 개발자님BMI지수가 너무길어요
	 * 소수점이하2자리에서끊어주세요
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String name="",result="";
		double bmi=0.0,height=0.0,weight=0.0,kaup=0.0;
		
		//----op
	System.out.println("이름?");
	name=scanner.next();
	
	System.out.println("키?");
	height=scanner.nextDouble();
	
	System.out.println("몸무게?");
	weight=scanner.nextDouble();
	
	
	kaup=((weight/height)/100)/(height/100);

		
		//
	if (kaup<18.5) {
		result="저체중";
		
	}else if (kaup>18.4 && kaup<23) {
		result="정상체중";
		
	}else if (kaup>23 && kaup<25) {
	    result="위험체중";
		
	}else if (kaup>25&&kaup<30) {
		result="비만1단계";
		
	}else if (kaup>30&&kaup<40) {
		result="비만2단계";
	
	}else if (kaup>=40) {
		result="비만3단계";
	}
	
		System.out.println(name+"의 BMI지수는 "+Double.parseDouble(String.format("%.2f", bmi)+"이고,"+result));
	}
		
	}

