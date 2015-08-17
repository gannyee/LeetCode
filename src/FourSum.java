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
		int[] arrays = new int[]{7, -1, 14, -12, -8, 7, 2, -15, 8, 8, -8, -14, -4,
				-5, 7, 9, 11, -4, -15, -6, 1, -14, 4, 3, 10, -5, 2, 1, 6, 11,
				2, -2, -5, -7, -6, 2, -15, 11, -6, 8, -4, 2, 1, -1, 4, -6, -15,
				1, 5, -15, 10, 14, 9, -8, -6, 4, -6, 11, 12, -15, 7, -1, -9, 9,
				-1, 0, -4, -1, -12, -2, 14, -9, 7, 0, -3, -4, 1, -2, 12, 14,
				-10, 0, 5, 14, -1, 14, 3, 8, 10, -8, 8, -5, -2, 6, -11, 12, 13,
				-7, -12, 8, 6, -13, 14, -2, -5, -11, 1, 3, -6 };
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result = fourSum(arrays,0);
		for(int i = 0;i < result.size();i ++)
			System.out.println(result.get(i));
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
						if(!elementSet.contains(taplet)){
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
