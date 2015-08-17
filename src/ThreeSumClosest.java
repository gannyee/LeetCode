import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class ThreeSumClosest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[] { 0, 2, 1, -3 };
		System.out.println(" A solution closest to target is : "
				+ ThreeSumClosest(s, 1));

	}

	public static int ThreeSumClosest(int[] nums, int target) {
		
		int sum = 0;
		int result = 0;
		int minResult = Integer.MAX_VALUE;
		int minSum = Integer.MAX_VALUE;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {

			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				sum = nums[i] + nums[left] + nums[right];
				System.out.println(sum);
				// result = Math.abs(Math.abs(sum) - Math.abs(target));
				result = Math.abs(sum - target);
				if (result < minResult) {
					if (result < minResult) {
						minResult = result;
						minSum = sum;
					}
				} else if (sum < target) {
					left++;
				} else if (sum > target) {
					right--;
				} else {
					return target;
				}
			}
		}
		return minSum;
	}

}
