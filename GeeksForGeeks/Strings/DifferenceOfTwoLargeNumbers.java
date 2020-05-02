/*
Problem statement:- https://www.geeksforgeeks.org/difference-of-two-large-numbers/

Input : str1 = "11443333311111111100", 
        str2 =     "1144422222221111"
Output : 11442188888888889989

Input :str1 = "122387876566565674",
       str2 =     "31435454654554"
Output : 122356441111911120

*/

 void differenceOfTwoLargeNumber(String s1, String s2) {
        BigInteger b1 = new BigInteger(s1);
        BigInteger b2 = new BigInteger(s2);

        System.out.println(b1.subtract(b2));
    }
