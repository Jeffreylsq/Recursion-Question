/**
 * Add from 1 to 100 by using recursion
 * @author Jeffrey Wei
 *
 */
public class FactorialDemo2 {

	public static void main(String[] args) {

		System.out.println(factorial(100));
	}
	public static int factorial(int n) {
		int num = 1;
		if(n <=1) {
			return num;
		}

		return factorial(n-1)+ n;
	}

}
