/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearch;

public class Main {
    
    public static void main(String[] args) {
        solve sd = new solve();
        int size = sd.checkInteger("Enter the size of Array: ", 1, 1000000);
        int[] arr = new int[size];
        sd.getRandomIntArray(arr);
        sd.displayArray(arr, "The Generated array: ");
        int key = sd.checkInteger("Enter key to search: ", 0, size);       
        sd.selectionSort(arr);
        int res = sd.binarySearch(arr, 0, size-1, key);
        if(res == -1) System.out.println("The key value " + key + " does not exist.");
        else System.out.println("The first index of key value " + key + " is: " + res);
    }
}
