
public class Reach_a_Number {
    public static void main(String[] args) {
        int target = 6;
        int i=1,count=0,sum=0;
    // Dont know why these solution is not working
        // to make every target positive
        target = Math.abs(target);
        while(true){
            if(sum==target){
                break;
            }
            //sum+=i;
            if(sum+i>target){
                sum-=i;
            }else{
                sum+=i;
            }
            i++;
            count++;
        }
        System.out.println(count);

    // ---- SOLUTION ONE GREEDY APPROACH ----
    // https://youtu.be/kz_0GjhFOzc
    int sum1 = 0, jump = 1;
		// to make every target positive
        target = Math.abs(target);
        while(true){
            sum1 += jump;
            if(sum1 == target) System.out.println(jump);
            if(sum1 > target && (sum1 - target)%2 == 0) break;
            jump++;
        }
        System.out.println(jump);   

    // ----- EFFICIENT SOLUTION -----
    int sum3 = 0; jump = 0;
        target = Math.abs(target);
        while (sum3<target)
            sum3 += ++jump;
        System.out.println((sum3-target) % 2 == 0 ? jump : jump + 1 + jump%2);    
    }
}
