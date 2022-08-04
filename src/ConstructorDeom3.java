/*
 * this() : new 없이 생성자를 호출하기 위한 매소드
 * 1. 반드시 생성자메소드에서만 사용해야하고
 * 2. 생성자 메소드내의 반드시 첫 번째 줄에 와야 한다.
 */
public class ConstructorDeom3 {
	public static void main(String[] args) {
		Sawon jimin = new Sawon("한지민", 2000000);
		System.out.println(jimin.name);
		System.out.println(jimin.salary);
	}
}
class Sawon{
	String name;
	int salary;
	public Sawon(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	public Sawon(String name) {
		this(name, 50000);
//		this.name = name;
//		new Sawon(name, 50000);		new를 쓰면 새 주소를 생성해서 의미x
	}
	public Sawon(int salary) {
		this("unknow", salary);
//		this.salary = salary;
//		new Sawon("unknow",salary);
	}
	public Sawon() {	
		this("unknow", 50000);
//		new Sawon("unknow", 500000);
	}
}
