/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :CHOI MIHWA
 * @file   :Calc.java
 * @story  :
*/
public class Calc3 {
/*두개의 정수를 입력받아서
 * opcode 값이1이면 덧셈
 * 2면 뺄셈
 * *3이면곱셈
 * *4면 나눗셈
 * 5면 나머지 구하는 계산기
 */
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int num1=0,num2=0,count=0,result=0;
		String symbol="";
		System.out.println("첫번째정수입력:");
		num1=scanner.nextInt();
		System.out.println("연산자입력:");
		count=scanner.nextInt();
		System.out.println("두변째정수입력");
		num2=scanner.nextInt();
		
	switch (count) {
	case 1:
		result=num1+num2;
		symbol="+";
		break;
		
	case 2:
		result=num1-num2;
		symbol="-";		
		break;
	case 3:
		result=num1*num2;
		symbol="*";
		break;
	case 4:
		result=num1/num2;
		symbol="/";
		break;
	case 5:
		result=num1%num2;
		symbol="%";
		
		break;

	default:
		
	System.out.println("1~5까지만 입력바랍니다");
		return;
		}
	System.out.println(num1+symbol+num2+"=");
	}
	
}
	

