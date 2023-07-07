public class Maximum_Value_at_a_Given_Index_in_a_Bounded_Array {
    public static void main(String[] args) {
        int n = 3-1, /*index = 2,*/  maxSum = 18;
        int sum=0,p;
       // if(index>n-1 || n>maxSum) return -1;
        p=n/2;
        if(n%2==0){
            //p=n/2;
            sum=p*3; 
            sum=maxSum-sum;
            
        }else{
            sum=p*2+(n)-p;
            sum=maxSum-sum;
            
        }
        System.out.println(sum);
    }
}
