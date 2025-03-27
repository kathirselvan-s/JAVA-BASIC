package arr;
import java.util.*;
public class SumAndAverage{
	public static void main(String...strings){
		int[] arr= {1,2,3,4,5};
		int sum=0;
		for(int i:arr) {
			 sum=sum+=i;
		}
		double avg = (double)sum/arr.length;
		System.out.println("addition of the arr = "+sum+"\naverage of the arr = "+avg);
	}
}
