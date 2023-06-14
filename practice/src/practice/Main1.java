package practice;

public class Main1 {
	public static void main(String[] args) {
		int n = 234;
		int rev = 0;
		int r;
		int num = n;
		while (n != 0) {
			r = n % 10;
			rev = rev * 10 + r;
			n = n / 10;
		}
		if (rev == n) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
}
