
package binarysearch;


public class View {
    public void displayArray(int[] arr, String mess) {
        int n = arr.length;
        System.out.printf(mess);
        System.out.print("[ ");
        for(int i = 0; i < n-1; ++i) {
            System.out.print(arr[i] +", ");
        }
        System.out.print(arr[n-1] +" ]");
        System.out.println("");
    }
}
