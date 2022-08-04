
public class ConstructorDeom {
	public static void main(String[] args) {
		Employee jimin = new Employee("2022-001", "한지민");
//		jimin.setEmpno("2022-001");
//		jimin.setName("한지민");
		jimin.setSalary(10000000);
		jimin.setHiredate("2022-08-04");
		jimin.myPrint();
	}
}
