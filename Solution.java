import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			long x = fs.nextLong(), y = fs.nextLong();
			long res = x * x - 2 * y;
			System.out.println((res == 0 ? "YES" : "NO"));
		}
		fs.close();
	}
}
