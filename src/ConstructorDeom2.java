/*
 * 생성자의 역할은 맴버변수 (필드, Property)의 초기화
 * 파라미터가 없는 생성자를 기본 생성자라고 한다.
 * 파라미터가 없는 기본 생성자는 어떻게 맴버변수를 초기화할 것인가?
 * 0, 0.0, false, '\0' or '\u0000', null
 * 기본생성자는 항상 해당 클래스의 생성자가 한 개도 없을 때 자동으로 만들어준다.
 * 만일 한 개라도 생성자가 존재하면 컴파일러는 자동으로 생성x
*/
public class ConstructorDeom2 {
	public static void main(String[] args) {
//		Tiger tiger = new Tiger();		// 기본 생성자
//		System.out.println(tiger.grade);
		MyCalendar mc = new MyCalendar();
		System.out.println(mc.year);
	}
}

class MyCalendar{
	int year, month, day;
//	public MyCalendar(int year, int month, int day) {	// 기본생성자가 아님
	
	public MyCalendar() {		// Default Constructor;	Override(재정의)
// 기본생성자를 0(컴퓨터 기본값)으로 쓰지 못하니 사용자가 정의한다
		this.year = 2022;
		this.month = 8;
		this.day = 4;
	}
}

class Tiger{
	String name;
	int age;
	boolean flag;
	double weight;
	char grade;
}
