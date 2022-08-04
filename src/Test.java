
public class Test {
	public static void main(String[] args) {
		// n = (n-1)+(n-2) 피보나치 수열 나타내기
		for(int i =1; i <=7; i++) {
			System.out.print(fibo(i) +"\t");
		}

/*		int before = 1;
		int after = 1;
		int next = 0;
			for(int i = 1; i < 7; i++) {
				System.out.print(before + "\t");
				next = before + after;
				before = after;
				after = next;
			}	*/
		}
	static int fibo(int n) {
		if(n == 1 || n == 2) return 1;
		else return fibo(n-1) + fibo(n-2);
	}
}
