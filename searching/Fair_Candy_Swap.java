
import java.util.HashSet;
import java.util.stream.IntStream;

public class Fair_Candy_Swap {
    public static void main(String[] args) {
        int[] aliceSizes = { 1, 1 }, bobSizes = { 2, 2 };
        int dif = (IntStream.of(aliceSizes).sum() - IntStream.of(bobSizes).sum()) / 2; 
        HashSet<Integer> S = new HashSet<>(); // WHY WE USED HASHSET: https://youtu.be/a3BBbfoijgo
        for (int i : aliceSizes)  // ENHANCED FOR LOOP 
            S.add(i);
        for (int j : bobSizes)
            if (S.contains(j + dif))
                System.out.println(new int[] { j + dif, j });
        System.out.println(new int[0]);
    
    // THIS IS A VERY SIMPLE PROBLEM
    // FIRST WE ARE FINDING SUM OF ALL THE VALUES OF BOTH THE ARRAY 
    // ARRAY WHOSE SUM IS HIGHER WILL DISTRIBUTE THE CANDY BETWEEN TWO EQUAL HALVES. SO WE WILL DIVIDE THE DIFFERNCE OF THE SUM BY 2
    // TO MAKE THE CANDY EQUAL ALICE WILL GIVE SOMETHING AND BOB WILL GIVE SOMETING 
    // AND THAT DIFFERENCE SHOULD BE EQUAL TO DIVIDE THE DIFFERNCE OF THE SUM BY 2
    // IN ABOVE EX: ALICE { 1, 1 } =2, BOB { 2, 2 }=4
    // BOB HAS 2 MORE CHOCOLATES SO BOB WILL SHARE 1 NOT 2 CHOCOLATES , SO WE ARE DOING 2/2=1
    // ALICE WILL GIVE 1 TO GET 2 , SO THE DIFFERENCE OF THIS GIVING IS DIIFFERECNE/2 WHICH IS 1 HERE
    }
}
