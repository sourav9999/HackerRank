import java.io.*;
import java.util.*;

public class Solution {
        static String insert = "";

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); // Fetch the List Size

        List<Integer> numberList = new ArrayList<Integer>();

        // Store the list values
        for(int i = 0; i < n; i++) {
            numberList.add(input.nextInt());
        }

        int q = input.nextInt(); //Number of Queries

        int delete = 0; 
        int[] queryValues = new int[2];

        for(int i = 0; i < q; i++) {
                insert = input.next();
                if(insert.equals("Insert")) {
                    queryValues[0] = input.nextInt();
                    queryValues[1] = input.nextInt();
                    numberList.add(queryValues[0], queryValues[1]); 
                } else {
                delete = input.nextInt();
                numberList.remove(delete);    
            }
        }
       
        input.close();

        //Expected Output
        for(Integer num : numberList) {
            System.out.print(num.toString() + " ");
        }
    }
}
