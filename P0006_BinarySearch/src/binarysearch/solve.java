/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binarysearch;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class solve {
    
    Scanner sc = new Scanner(System.in);
    
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
    
    public void getRandomIntArray(int[] arr) {
        Random rand = new Random();
        int n = arr.length;
        for(int i = 0; i < n; ++i) {
            arr[i] = rand.nextInt(n);
        }
    }
    
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
    
    public void selectionSort(int[] arr) {
        int tmp,minIndex;
        int n = arr.length;
        for(int i = 0; i < n-1; ++i) {
            minIndex = i;
            for(int j = i+1; j < n; ++j) {
                if(arr[minIndex] < arr[j] ){
                    tmp = arr[j];
                    arr[j] =arr[minIndex];
                    arr[minIndex] = tmp;
                    minIndex = j;
                }
            }
        }
    }
    
    public int binarySearch(int[] arr, int left, int right, int target) {
        while(left <= right) {
            int mid = (right-left)/2;
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
}
