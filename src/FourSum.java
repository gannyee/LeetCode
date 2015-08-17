import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class FourSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrays = new int[]{1,0,-1,0,-2,2,-12,23,21,2,-90,87,14,98};
		for(int i = 0;i < fourSum(arrays,0).size();i ++)
			System.out.println(fourSum(arrays,0).get(i));
	}

	public static List<List<Integer>> fourSum(int[] nums, int target) {
		
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		HashSet<List<Integer>> elementSet = new HashSet<List<Integer>>();
		Arrays.sort(nums);
		
		for(int i = 0;i < nums.length - 3;i ++){
			for(int j = i + 1;j < nums.length - 2;j ++){
				int left = j + 1;
				int right = nums.length - 1;
				while(left < right){
					int sum = nums[i] + nums[j] + nums[left] + nums[right];
					if(sum == target){
						List<Integer> taplet = new ArrayList<Integer>();
						taplet.add(nums[i]);
						taplet.add(nums[j]);
						taplet.add(nums[left]);
						taplet.add(nums[right]);
						if(!result.contains(taplet)){
							result.add(taplet);
							elementSet.add(taplet);
						}
						left ++;
						right --;
					}else if(sum < target){
						left ++;
					}else{
						right --;
					}
				}
			}
		}
		return result;
	}
	
}