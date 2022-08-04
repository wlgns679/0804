
public class Car {
	private String name;
	private int price;
	
	public Car() {
		System.out.println("안써도 컴파일러가 만들어주는 기본생성자");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void myPrint() {
		System.out.println(this);
	}
}
