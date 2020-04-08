/*
Problem Statement:- https://www.hackerrank.com/challenges/crush/problem

Sample input 
    a b k
    1 5 3
    4 8 7
    6 9 1

Explanation:- 
index->	 1 2 3  4  5 6 7 8 9 10
	[0,0,0, 0, 0,0,0,0,0, 0]
	[3,3,3, 3, 3,0,0,0,0, 0]
	[3,3,3,10,10,7,7,7,0, 0]
	[3,3,3,10,10,8,8,8,1, 0]

Sample output 
10
-------------------------------------

Sample Input
5 3
1 2 100
2 5 100
3 4 100

Sample Output
200

Explanation
After the first update list will be 100 100 0 0 0. 
After the second update list will be 100 200 100 100 100. 
After the third update list will be 100 200 200 200 100. 
The required answer will be 200.
*/



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import org.apache.commons.lang3.ArrayUtils;

public class Solution {

    // Complete the arrayManipulation function below.
    static long arrayManipulation(int n, int[][] query) {
        int max, min;
        min = query[0][0];
        max = query[0][1];
        long[] arr = new long[n];

         for (int i = 0; i < n; i++) {
               arr[i] = 0;
         }

        for (int j = 1; j < query.length; j++) {
            if (query[j][0] >= min) {
                min = query[j][0];
            }

            if (query[j][1] <= max) {
                max = query[j][1];
            }

            for (int i = min - 1; i <= max - 1; i++) {
                arr[i] += query[j][2];
            }
        }

        Arrays.sort(arr);
        return arr[arr.length - 1] + query[0][2];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);
        int m = Integer.parseInt(nm[1]);

        int[][] queries = new int[m][3];

        for (int i = 0; i < m; i++) {
            String[] queriesRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int queriesItem = Integer.parseInt(queriesRowItems[j]);
                queries[i][j] = queriesItem;
            }
        }

        long result = arrayManipulation(n, queries);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
