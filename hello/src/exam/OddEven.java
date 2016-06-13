/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :OddEven.java
 * @story  :
*/
public class OddEven {
/**
 *개발자님,홀짝게임하나 만들어주세요
 *사용자가 홀인지짝인지 맞추면 WIN
 *틀리면 LOOSE가 출력되면 됩니다
 * (사용자가모르는 랜덤을 써야한다)
 * 
 */
	
	public static void main(String[] args) { 
		   Scanner scanner = new Scanner(System.in); 
		   Random random = new Random();
		     
		    int num = 0, num2 = 0, userNum = 0; 
		   String result=""; 
		   num=random.nextInt(10)+1; 
		     
		   System.out.println("=== 개발자만 보는 화면 =="); 
		   System.out.println("랜덤수는"+num); 
		   System.out.println("짝이라고 생각하면 0을 홀이라고 생각하면 1을 입력하시오"); 
		   userNum = scanner.nextInt(); 
		   num2 = num % 2; 
		     
		   if (num2 == userNum) { 
		    result = "Win"; 
		      
		  } else {  
		     System.out.println("LOSE"); 
		   result = "LOSE"; 
		  } 
		   System.out.println("결과 :"+ result);
	
	
}
}
	
	
	
	

