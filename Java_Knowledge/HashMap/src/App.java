import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        // HashMap<String, Integer> happy = new HashMap<>();
        // happy.put("a", 10);
        // happy.put("b", 3);
        // happy.put("c", 88);
        // System.out.println(happy);
        // System.out.println(happy.get("a"));
        // HashMap<String, String> fun = new HashMap<>();
        // fun.put("bobby", "123");
        // fun.put("Jay", "234");
        int[] nums = {4, 2, 8, 10, 11};
        int[] arr = twoSum(nums, 13);
        System.out.print("[" + arr[0] + ", " + arr[1] + "]" );


    }

    /*
     * [4, 2, 8, 10, 11] target = 13
     * 
     */
    public static int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> complements = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            Integer complementIndex = complements.get(nums[i]);
            System.out.println(complementIndex + " ");
            if(complementIndex != null){
                return new int[]{i, complementIndex};
            }
            complements.put(target - nums[i], i);
        }
        return nums;
    }
}
