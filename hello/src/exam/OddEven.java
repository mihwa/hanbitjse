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
 *�����ڴ�,Ȧ¦�����ϳ� ������ּ���
 *����ڰ� Ȧ����¦���� ���߸� WIN
 *Ʋ���� LOOSE�� ��µǸ� �˴ϴ�
 * (����ڰ��𸣴� ������ ����Ѵ�)
 * 
 */
	
	public static void main(String[] args) { 
		   Scanner scanner = new Scanner(System.in); 
		   Random random = new Random();
		     
		    int num = 0, num2 = 0, userNum = 0; 
		   String result=""; 
		   num=random.nextInt(10)+1; 
		     
		   System.out.println("=== �����ڸ� ���� ȭ�� =="); 
		   System.out.println("��������"+num); 
		   System.out.println("¦�̶�� �����ϸ� 0�� Ȧ�̶�� �����ϸ� 1�� �Է��Ͻÿ�"); 
		   userNum = scanner.nextInt(); 
		   num2 = num % 2; 
		     
		   if (num2 == userNum) { 
		    result = "Win"; 
		      
		  } else {  
		     System.out.println("LOSE"); 
		   result = "LOSE"; 
		  } 
		   System.out.println("��� :"+ result);
	
	
}
}
	
	
	
	

