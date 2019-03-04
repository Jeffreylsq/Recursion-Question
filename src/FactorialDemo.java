/**
 * Interview question
 *  1$ per bottle of coke, and two empty bottle can trade in for one new 
 * bottle of coke, three cap can exchange one bottle of coke. 
 * How many bottle can we get when we have $20S
 * 
 * @author Jeffrey Wei
 *
 */

public class FactorialDemo {

	public static void main(String[] args) {

		System.out.println(Factorial(20,0,0));
	}
    
	public static int Factorial(int money, int bottle, int cap) {
		
		bottle = money + bottle;
		cap = money + cap;
		
		if(bottle/2 + cap/3 == 0) {
			return money;
		}
		return money + Factorial((bottle/2+cap/3), bottle%2, cap%3);
		
		
	}
}
