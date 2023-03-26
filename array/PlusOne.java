import java.util.ArrayList;
//import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
    public static void main(String[] args) {
        ArrayList<Integer> output = new ArrayList<Integer>();
        int[] digits = {9,9,9};
         int carry=1,add=0,sum=0;
        for (int i = digits.length-1; i>=0; i--) {
            sum=digits[i]+carry;
            add=sum%10;
            output.add(add);
             carry=sum/10;
    
             if(i==0 && carry !=0)
               output.add(carry);            
        }
        Collections.reverse(output);
        System.out.println(output);
    }
}
