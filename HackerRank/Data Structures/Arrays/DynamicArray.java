import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int numQueries = scan.nextInt();
        
        // Initialize Empty Sequences
        Vector< Vector<Integer> > seqN = new Vector< Vector<Integer> >(n);
        for(int i = 0; i < n; i++){
            seqN.add(new Vector<Integer>());
        }
        
        // Process Queries
        int lastAns = 0;
        for(int i = 0; i < numQueries; i++){
            int queryType = scan.nextInt();
            int x = scan.nextInt();
            int y = scan.nextInt();
            int seqIndex = ((x ^ lastAns ) % n);
            Vector<Integer> currSeq = seqN.get(seqIndex);
            
            if(queryType == 1){
                currSeq.add(y);
            }
            else{ // Query type 2
                lastAns = currSeq.get(y % currSeq.size());
                System.out.println(lastAns);
            }
        }
        scan.close();
    }
}
