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
		
		Random random=new Random();
		Scanner scanner=new Scanner(System.in);
		
	int num=random.nextInt(10)+1;//범위를 정해주고싶으면 /10.999이므로
	int userNum=scanner.nextInt();
	String result="Loose";
	int num=0,choose=0;
	
	System.out.println("홀짝게임");
	System.out.println("홀이면0,짝이면1를 입력:");
	choose=scanner.nextInt();
	
	if (choose) {
	
	
	
	switch(choose);
	case 0:
	result="WIN";break;
	case 1:
	result="Loose";break;
		
	
	
	
System.out.println("돈을 거시는데 짝이라고 생각하면0을" +"홀이라고 생각하면 1을 입력하시오");//홀이면0,짝이면1를 입력 5 0과1숫자중하나만 입력하세요

	System.out.println("WIN");
	
	
	
}
}
	//
	
	
	

