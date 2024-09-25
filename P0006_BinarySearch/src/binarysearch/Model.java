
package binarysearch;

import java.util.Random;


public class Model {
    
    public void getRandomIntArray(int[] arr) {
        Random rand = new Random();
        int n = arr.length;
        for(int i = 0; i < n; ++i) {
            arr[i] = rand.nextInt(n);
        }
    }
    
    public void bubbleSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = n-1; j > i; j--){
                if(arr[j-1] > arr[j]) {
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            } 
        }
    }
    
    private int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length-1;

        while(left <= right) {
            int mid =  left + (right-left)/2;
            if(arr[mid] == target) {
                return mid;
            }
            else if(arr[mid] < target) {
                left = mid+1;
            }
            else right = mid-1;
            }
        return -1;
    }  
     
    public void binarySearchAll(int[] arr, int target) {
        int keyIndex = binarySearch(arr, target);
        
        if(keyIndex != -1) {
            int left = keyIndex;
            int right = keyIndex;
        
            while(left > 0 && arr[left-1] == target) {
                left--;
            }
        
            while(right < arr.length-1 && arr[right+1] == target) {
                right++;
            }
            
            System.out.print("The " + target + " is found at: ");
            if(left != right) {
                for(int i = left; i <= right-1; i++) {
                    System.out.print(i + ", ");
                }
                System.out.print(right);
                System.out.println("");
            }
            else
                System.out.print(keyIndex);
                System.out.println("");
        }
        else System.out.println("The key value not found");
    }
}
