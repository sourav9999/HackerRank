/*
Problem Statement:- https://www.hackerrank.com/challenges/array-left-rotation/problem


Sample Input
5 4  // elemenet, roatation
1 2 3 4 5

Sample Output
5 1 2 3 4
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);
        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        
        // Place the input element without shifting every element n times
        int[] arr = new int[a.length];

        for(int i=0; i<n;i++) {
            arr[(i+n-d)%n] = a[i];
        }

        for(int i=0; i<n;i++) {
            System.out.print(arr[i] + " ");
        }
        scanner.close();
    }
}
