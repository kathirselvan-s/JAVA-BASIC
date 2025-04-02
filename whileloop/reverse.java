package whileloop;
import java.util.*;
public class reverse {
	public static void main(String...strings) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your number : ");
		int number = sc.nextInt();
		int reverse = 0;
		while (number != 0) {
			int last = number%10;
			reverse = reverse*10+last;
			number = number/10;
		}
		System.out.println("nyour reversed : "+reverse);
	}
}
