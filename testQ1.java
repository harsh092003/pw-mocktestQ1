import java.util.Arrays;
public class testQ1 {
    public static void main(String args[]){
        int nums[]={0,1,0,3,12};
        System.out.println(Arrays.toString(nums));
        moveZero(nums);
        System.out.println("\nModified Array:");
        System.out.println(Arrays.toString(nums));
    }
   
    public static void moveZero(int [] nums){
        int n=nums.length;
        int c=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[c]=nums[i];
                c++;
            }
        }
        while(c<n){
            nums[c]=0;
            c++;
        } 
        
    }
}