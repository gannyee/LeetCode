import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[]{3,2,4};
		System.out.println(Arrays.toString(twoSum(a,6)));
	}
		//暴力方法（Brute force method）
	    /*public static int[] twoSum(int[] nums, int target) {
	        int[] index = new int[2];
	        for(int i = 0; i < nums.length;i ++){
	            for(int j = i + 1;j < nums.length;j ++){
	                if (nums[i] + nums[j] == target){
	                    index[0] = i + 1;
	                    index[1] = j + 1;
	                    break;
	                }
	            }
	        }
	        return index;
	    }*/
		//利用HashMap解决（Utilize HashMap Method）
		public static int[] twoSum(int[] nums,int target){
			if(nums.length < 2)
				return null;
			int[] index = new int[2];
			Map<Integer,Integer> newNums = new HashMap<Integer,Integer>();
			
			for(int i = 0;i < nums.length;i ++)
				newNums.put(nums[i],i);
			
			for(int i = 0;i < newNums.size();i ++){
					if(newNums.containsKey(target - nums[i]) &&((i + 1) != (newNums.get(target - nums[i]) + 1) )){
						index[0] = i + 1;
						index[1] = newNums.get(target - nums[i]) + 1;
						break;
					}
			}
			return index;
		}

}
