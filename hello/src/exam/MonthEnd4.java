/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :CHOI MIHWA
 * @file   :MonthEnd.java
 * @story  :
 */
public class MonthEnd4 {
	/**
	 *년,월을 입력하면 말일이 몇일인지 알려주는 
	 *프로그램
	 *단,윤년 2월은 29일이고, 나머지해는 28일로마감
.	 *1~12를 벗어난 숫자를 입력하면 
	 *잘못된 입력값입니다 라고 뜬다 
	 *2월의 말일은 29일입니다
	 *윤년의조건
	 *연도를 4로 나눈값이 0이라면 윤년일 수있다
	 *그러나 해당연수가 100으로 나눠떨어지면 평년이다
	 *2000년은 4로 나눈값이0이라서 윤년의 조건은 되는데 다시 이값이 100으로 나눠떨어지기때문에 평년이되었다
	 *평년이라해도 다시400으로 나눠떨어지는 년도는 윤년이다
	 *2016/
	 **/
public static void main(String[] args) {
	
}
	  public static void main(String[] args) { 
          
		  
		  Scanner scanner=new Scanner(System.in);
		          
		      int  end =0,day=0; 
		       String mon; 
		         System.out.println("년을 입력하세요 (예)2016");      
		       int year=2016; 
		        System.out.println("월을 입력하세요(예)2월"); 
		        int month=2; 
		         mon= scanner.nextLine();
		          
		         
		        switch (mon) { 
		  case "1":
		   break; 
		  case "2": 
		   if (year==1) { 
		    day=29; 
		   } else { 
		                  day=28; 
		    day =29; 
		   break;}
		   
		   case "3": 
		     day =30; 
		    break; 
		   case "4": 
		    day =31; 
		    break; 
		    case "5": 
		     day =30; 
		    break; 
		    case "6": 
		    day =31; 
		   break; 
		   case "7": 
		    day =31; 
		    break; 
		    case "8": 
		    day =31; 
		     break; 
		   case "9": 
		     day =30; 
		   break; 
		    case "10": 
		    day =31; 
		     break; 
		   case "11": 
		    day =30; 
		    break; 
		   case "12": 
		     day =31; 
		    break; 
		       default: 
		    System.out.println("1~12를 벗어난 숫자를 입력하면 잘못된 입력값이라고뜬다"); 
		     return;     
		    }
		   
		         System.out.println(year+"년"+mon+"월"+day+"일입니다");     
		  }
		}

