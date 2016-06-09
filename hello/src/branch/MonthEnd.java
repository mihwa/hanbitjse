/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :MonthEnd.java
 * @story  :
 */
public class MonthEnd {
	/**
	 *월을입력하면 말일이 몇일인지 알려주는 
	 *프로그램
	 *단,2월은 29일로한정함
	 *1~12를 벗어난 숫자를 입력하면 잘못된 입력값입니다 라고 뜬다 
	 *2월의 말일은 29일입니다
	 **/

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String month="",day="";

		System.out.println("월을입력");
		month=scanner.nextLine();

		switch (month) {
		case "1":day="31";break;
		case "3":day="31";break;
		case "5":day="31";break;
		case "7":day="31";break;
		
		case "2":day="29";break;
		case "4":day="30";break;
		
		case "6":day="30";break;
		
		case "8":day="31";break;
		case "9":day="30";break;
		case "10":day="31";break;
		case "11":day="30";break;
		case "12":day="31";break;

		default:System.out.println("1~12를 벗어난 숫자를 입력하면 잘못된 입력값이라고뜬다");
		}

		System.out.println(month+"월의말일은"+day);//2월의 말일은 29일입니다



	}

}
