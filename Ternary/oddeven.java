package Ternary;
import java.util.*;

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = (n % 2 == 0) ? 1 :0;
        System.out.println(result);
        sc.close();
    }
}
