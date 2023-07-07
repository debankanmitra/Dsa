import java.util.Arrays;
// https://youtu.be/LzZFUTWE55c
public class Koko_Eating_Bananas {
    public static void main(String[] args) {
        int[] piles = {30,11,23,4,20};
        int h = 6;
// TO MAKE IT EFFICIENT WE CAN USE END = 10^9 , (p + m - 1) / m, WHICH IS equal to ceil(p / m)       
        Arrays.sort(piles);
        int start=1,end=piles[piles.length-1];
        //System.out.println(end);
        while (start<end) {
            int m = (start + end) / 2;
            double total = 0;
            for (double p : piles) total+=Math.ceil(p / m); //int mod=piles[i]%k;  WE WILL USE CEIL INSTEAD OF IT
                                                         //int div=piles[i]/k;
                                                         // instead of starting from k==1 , we are taking mid 
            
               /*  if (mod==0) {  // CEIL REPLACES THIS PART
                    sum+=div;
                }else{
                    sum+=div+1;
                }
                if (sum>h) {
                    break;
                }*/
            
            if (total>h) start=m+1; // THIS MEANS COCO HAVE TO EAT MORE BANANAS AND WE WILL GO TO RIGHT PART
            else end=m;      
        }
        System.out.println(start);
        
    }
}
