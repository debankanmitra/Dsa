//Here you can see if you move token to odd to odd places your cost is 0 
//and from even to odd places your cost is +1 each , so we will use for loop 
//to find how many even and odd places/chips are there and will increment even and 
//odd counter accordingly , and after the loop we will find the minimum number between 
//even and odd , these minimum number will be the minimum cost..
// See example 1 it is taking a token from 3 to 1 with cost 0 and then comapring tokens between 1 and 2

public class Minimum_Cost_to_Move_Chips_to_The_Same_Position {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        int even=0,odd=0;
        for (int i = 0; i < position.length; i++) {
            if (position[i]%2==0) {
                even++;
            }
            if (position[i]%2!=0) {
                odd++;
            }
        }
        if (even>odd) {
            System.out.println(odd);
        } else {
            System.out.println(even);
        }
    }
}
