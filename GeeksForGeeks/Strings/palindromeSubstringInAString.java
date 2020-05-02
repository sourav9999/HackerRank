/*
Problem statement:- https://www.geeksforgeeks.org/count-palindrome-sub-strings-string/

Input : str = "abaab"
Output: 3
Explanation : 
All palindrome substring are :
 "aba" , "aa" , "baab" 

Input : str = "abbaeae"
Output: 4
Explanation : 
All palindrome substring are : 
"bb" , "abba" ,"aea","eae"

*/

public class palindromeSubStrings {
    public static void main() {
        String str = "abaab";
        int j = 0;
        int len = str.length();
        Set<String> stack = new LinkedHashSet<String>();
        while (j < len) {
            for (int i = j; i < len; i++) {
                String s = str.substring(j, i + 1);
                if (checkPalindrome(s)) {
                    stack.add(s);
                }
            }
            j++;
        }
        System.out.println(stack);
    }

    private static boolean checkPalindrome(String subStrings) {
        int start = 0;
        int end = subStrings.length() - 1;

        if(start == end){
            return false;
        }
        
        while (end > start) {
            if (subStrings.charAt(start++) != subStrings.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
