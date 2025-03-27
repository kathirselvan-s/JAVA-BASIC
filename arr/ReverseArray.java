package arr;

public class ReverseArray {
	public static void main(String...strings) {
		int[] arr = {1,2,3,4,5};
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
