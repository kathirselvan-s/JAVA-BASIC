package forloop;
import java.util.*;
public class table {
	public static void main(String... kathir) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the table you want ? ");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(i+"*"+n+"="+i*n);
		}
		sc.close();
	}
}
