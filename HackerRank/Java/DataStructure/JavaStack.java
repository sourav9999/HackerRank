/* Java Stack

Problem Statement

In computer science, a stack or LIFO (last in, first out) is an abstract data type that serves as a 
collection of elements, with two principal operations: push, which adds an element to the collection, and 
pop, which removes the last element that was added.(Wikipedia)
A string containing only parentheses is balanced if the following is true: 1. if it is an empty string 2. 
if A and B are correct, AB is correct, 3. if A is correct, (A) and {A} and [A] are also correct.

Examples of some correctly balanced strings are: "{}()", "[{()}]", "({()})" 

Examples of some unbalanced strings are: "{}(", "({)}", "[[", "}{" etc.

Given a string, determine if it is balanced or not.

Input Format

There will be multiple lines in the input file, each having a single non-empty string. You should read input till end-of-file.

The part of the code that handles input operation is already provided in the editor.

Output Format

For each case, print 'true' if the string is balanced, 'false' otherwise.

Sample Input

{}()
({()})
{}(
[]

Sample Output

true
true
false
true
*/

import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
        Scanner sc = new Scanner(System.in);
        Stack<Character> characterStack = new Stack<>();
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            char []c = input.toCharArray();

            for (int i = 0; i < c.length; i++) {
                if (!characterStack.isEmpty()) {
                    switch(input.charAt(i)) {
                        case '}' : if (characterStack.peek() == '{') {
                            characterStack.pop();
                        } break;
                        case ']' : if (characterStack.peek() == '[') {
                            characterStack.pop();
                        } break;
                        case ')' : if (characterStack.peek() == '(') {
                            characterStack.pop();
                        } break;
                        default: characterStack.push(input.charAt(i));
                    }
                } else {
                characterStack.push(input.charAt(i));
                }    
            }
        System.out.println(characterStack.isEmpty() ? "true" : "false");
        characterStack.clear();
        }
    }
}
