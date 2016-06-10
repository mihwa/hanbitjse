/**
 * 
 */
package exam;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

/**
 * @date   :2016. 6. 10.
 * @author :CHOI MIHWA
 * @file   :Gender.java
 * @story  :
*/
public class Gender2 {
/**
 * 개발자님 저희 사이트는 주민번호 앞자리와 성별
 * 판별번호만 입력합니다
 * 예를들어 800101-1까지만 입력하면
 * 소비자가 자신이 남자인지 여자인지 밝히지 않아도
 * 자동ㅇ으로 DB에저장되는 시스템을 개발해주세요
 * [출력문] 홍길동(남),아이유(여)
 */
	/*		
	1,2 : 국내 1900년대생 남,녀
	3,4 : 국내 2000년대생 남,녀
	5,6 : 외국 1900년대생 남,녀
	7,8 : 외국 2000년대생 남,녀		
	*/
	public static void main(String[] args) {
		//---initial---
	Scanner scanner=new Scanner(System.in);	
		String snn="",name="",gender="";

	//------oop---
		System.out.println("이름 :");
	name=scanner.nextLine();
	System.out.println("snn입력");
		snn=scanner.next();
		System.out.println("성별");
	
		char c =snn.charAt(7);
	
	
	if (c=='0'||c=='9') {
		System.out.println("주민등록번호에 0,9는 입력불가");
	return;//시스템끊어버림.단
	
	}		
	switch (c) {
	case '1':case '3':case '5':case'7':gender="남";break;
	case'2':case'4':case'6':case'8':gender="여";break;
//swich(c%2) -upcasting=:작은것을 큰곳에/ downcasting:넓은것을 큰곳에
	
default:
	break;
	
		}System.out.println("[출력물]"+name+"("+gender+")");//[출력문] 홍길동(남),아이유(여)
	}
}
