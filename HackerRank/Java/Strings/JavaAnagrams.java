/* Java Anagrams
Two strings A and B are called anagrams if they consist same characters, but may be in different orders. So the list of anagrams of CAT are "CAT", "ACT" , "TAC", "TCA" ,"ATC" and "CTA.

Given two strings, print "Anagrams" if they are anagrams,  print "Not Anagrams" if they are not. The strings may consist at most 50 english characters, the comparision should NOT be case sensitive.

This exercise will verify that you are able to sort the characters of a string, or compare frequencies of characters.
*/

import java.util.Scanner;

public class Solution {

static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length()) {
            return false;
        } else {
            // sort the strings and see if they are equal to be considered an Anagram
            String A = a.toLowerCase();
            String B = b.toLowerCase();

            String sortedA = String.valueOf(sort(A));
            String sortedB = String.valueOf(sort(B));

            if (sortedA.equals(sortedB)) {
                return true;
            }
        }
        return false;
    }

    private static char[] sort(String X) {
        char temp;
        char[] x = X.toCharArray();
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j+1]) {
                    temp = x[j];
                    x[j] = x[j+1];
                    x[j+1] = temp;
                }
            }
        }
        return x;
    }

  public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
