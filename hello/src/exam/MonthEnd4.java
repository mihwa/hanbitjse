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
	 *��,���� �Է��ϸ� ������ �������� �˷��ִ� 
	 *���α׷�
	 *��,���� 2���� 29���̰�, �������ش� 28�Ϸθ���
.	 *1~12�� ��� ���ڸ� �Է��ϸ� 
	 *�߸��� �Է°��Դϴ� ��� ��� 
	 *2���� ������ 29���Դϴ�
	 *����������
	 *������ 4�� �������� 0�̶�� ������ ���ִ�
	 *�׷��� �ش翬���� 100���� ������������ ����̴�
	 *2000���� 4�� ��������0�̶� ������ ������ �Ǵµ� �ٽ� �̰��� 100���� �����������⶧���� ����̵Ǿ���
	 *����̶��ص� �ٽ�400���� ������������ �⵵�� �����̴�
	 *2016/
	 **/
public static void main(String[] args) {
	
}
	  public static void main(String[] args) { 
          
		  
		  Scanner scanner=new Scanner(System.in);
		          
		      int  end =0,day=0; 
		       String mon; 
		         System.out.println("���� �Է��ϼ��� (��)2016");      
		       int year=2016; 
		        System.out.println("���� �Է��ϼ���(��)2��"); 
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
		    System.out.println("1~12�� ��� ���ڸ� �Է��ϸ� �߸��� �Է°��̶����"); 
		     return;     
		    }
		   
		         System.out.println(year+"��"+mon+"��"+day+"���Դϴ�");     
		  }
		}

