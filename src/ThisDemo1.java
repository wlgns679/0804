
public class ThisDemo1 {
	public static void main(String[] args) {
		Lion lion = new Lion();
		Lion another = lion.getLion();
		System.out.println(another.name);
		System.out.println(another.age);
	}
}

class Lion{
	String name = "한지민";
	int age = 26;
	Lion getLion() {
		return this;		// this를 넘기면 주소 전체를 다 넘긴다
	}
}