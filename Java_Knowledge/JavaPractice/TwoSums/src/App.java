import java.util.HashMap;
import java.util.Map;

public class App {
    // public static int[] twoSum(int[] nums, int target){
    //     int[] arr = new int[2];
    //     for(int i = 0; i < nums.length - 1; i++){
    //         for(int j = i + 1; j < nums.length; j++){
    //             if(nums[i] + nums[j] == target){
    //                 arr[0] = i;
    //                 arr[1] = j;
    //             } 
    //         }
    //     }
    //     return arr;
    // }    
    public static void main(String[] args) throws Exception {
        int[] nums = new int[]{2, 5, 8, 9};
        int[] arr = twoSum(nums, 11);
        System.out.print("(" + arr[0] + ", " + arr[1] + ")");



    }
}
