package arr;

public class largenum {
	public static void main(String...strings) {
//        int[] num = {10,20,50,5,100};
//        int max = num[0];
//
//        for(int n:num) {
//            if (n > max) {
//                max = n;
//            }
//        }
//        System.out.println("Large num" + max);
		int[] num = {5,3,8,1};
		int max = num[0];
		for (int i : num) {
			if (max < i) {
				max = i;
			}
		}
		System.out.println(max);
    }
}