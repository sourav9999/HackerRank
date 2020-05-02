/*
Problem Statement:- https://www.geeksforgeeks.org/minimum-sum-squares-characters-counts-given-string-removing-k-characters/

Input :  str = abccc, K = 1
Output :  6
We remove c to get the value as 12 + 12 + 22

Input :  str = aaab, K = 2
Output :  2

*/

void calculateMinimumSum(String s, int removeCharacterCount) {
        Map<Character, Integer> m = new HashMap<>();

        for (Character c : s.toCharArray()) {
            m.put(c, m.containsKey(c) ? m.get(c) + 1 : 1);
        }

        int maxValue = m.entrySet().stream().max(Comparator.comparing(x -> x.getValue())).get().getValue();

        int sum = 0;
        for (Map.Entry x : m.entrySet()) {
            int value = (int) x.getValue();
            sum += value != maxValue ? Math.pow(value, 2) : Math.pow(value - removeCharacterCount, 2);
        }

        System.out.println(sum);
    }
