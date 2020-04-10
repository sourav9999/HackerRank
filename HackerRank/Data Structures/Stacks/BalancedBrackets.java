/*
Problem Statement:- https://www.hackerrank.com/challenges/balanced-brackets/problem

Sample Input
3
{[()]}
{[(])}
{{[[(())]]}}

Sample Output
YES
NO
YES
*/


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
    Stack<Character> characterStack = new Stack<>();
        if(s.length() % 2 != 0){
            return "NO";
        }

        for (int i = 0; i < s.length(); i++) {
            if (!characterStack.isEmpty()) {
                switch(s.charAt(i)) {
                    case '}' : if (characterStack.peek() == '{') {
                        characterStack.pop();
                    } break;
                    case ']' : if (characterStack.peek() == '[') {
                        characterStack.pop();
                    } break;
                    case ')' : if (characterStack.peek() == '(') {
                        characterStack.pop();
                    } break;
                    default: characterStack.push(s.charAt(i));
                }
            }
            else {
                characterStack.push(s.charAt(i));
            }    
        }
        return characterStack.isEmpty() ? "YES" : "NO" ;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}


