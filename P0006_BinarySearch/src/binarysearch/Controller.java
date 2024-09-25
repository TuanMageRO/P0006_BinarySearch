
package binarysearch;

import java.util.Scanner;


public class Controller {
    
    private final Scanner sc = new Scanner(System.in);
    private final Model mod = new Model();
    private final View v = new View();
    
    public int checkInteger(String mess, int min, int max) {
        int n;
        String err = "Only Integer in range" + min + " to " + max + " is permitted.";
        while(true) {
            try{
                System.out.print(mess);
                n = Integer.parseInt(sc.nextLine());
                if( n < min || n > max) {
                    System.err.println(err);
                    continue;
                }
                return n;
            }
            catch(NumberFormatException e) {
                System.err.println(err);
            }
        }
    }
    
    public void run(){
        int size = checkInteger("Enter the size of Array: ", 1, Integer.MAX_VALUE);
        int[] arr = new int[size];        
        mod.getRandomIntArray(arr);
        mod.bubbleSort(arr);
        v.displayArray(arr, "The Sorted array: ");   
        int key = checkInteger("Enter key to search: ", 0, size); 
        mod.binarySearchAll(arr, key);
    }
}
