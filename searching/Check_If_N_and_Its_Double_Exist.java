import java.util.HashSet;

public class Check_If_N_and_Its_Double_Exist {
    public static void main(String[] args) {
    // WE CAN ALSO DO THE SAME USING TWO POINTER METHOD WITH O(N^2) 
    // WE USED HASHSET TO DO IT IN O(N)
    // LETS SAY THE VALUE IS 10 AND 5 IS PREVIOUSY ON HASHSET SO WE HAVE TO DO 10/2 
    // LETS SAY THE VALUE IS 5 AND 10 IS PREVIOUSY ON HASHSET SO WE HAVE TO DO 5*2   
        int[] arr = {10,2,5,3};
        HashSet<Float> map = new HashSet<>(); 
        for(float i:arr) 
            if(map.contains(i/2)==true | map.contains(i*2)==true) System.out.println(true);
            else map.add(i);          
        System.out.println(false);
    }
}
