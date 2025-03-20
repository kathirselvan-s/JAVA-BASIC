package ARRAY;

public class bubblesort {
	public static void main(String...strings) {
		int num[] = {6,3,4,9,1};
		int s = num.length;
		int temp = 0;
		
		
		System.out.println("Before sorting");
		for (int nums : num) {
			System.out.print(nums+" ");
		}
		
		
		for (int i=0;i<s;i++) {
			for (int j = 0;j<s-i-1;j++) {
				if (num[j]>num[j+1]) {
					temp = num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		
		
		System.out.println("\nAfter sorting");
		for (int nums : num) {
			System.out.print(nums+" ");
		}
	}

}
