package arr;
public class  sameele{
    public static void main(String[] kathir) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 7, 3, 9, 4};
        
        if (arr1.length != arr2.length) {
            System.out.println("Arrays have different lengths. Comparison not possible.");
            return;
        }
        
        int n = arr1.length;
        //System.out.println("The length of the arrays: " + n);
        //boolean matchFound = false;
        
        for (int i = 0; i < n; i++) {
            if (arr1[i] == arr2[i]) {
                System.out.print(i+" ");
        //        matchFound = true;
            }
        }
        
        //if (!matchFound) {
        //    System.out.println("No matching indices found.");
        //}
    }
}
