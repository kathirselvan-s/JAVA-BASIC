package Ternary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int result = (n % 2 == 0) ? 1 :0;
        //System.out.println(result);
        if (n%2==0) {
        	System.out.println("it is the even number");
        }
        else {
        	System.out.println("it is the odd number");
        }
        sc.close();
    }
}