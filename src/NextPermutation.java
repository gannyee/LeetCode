import java.util.Arrays;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,2,5,4,3,0};
		System.out.println(Arrays.toString(nextPermutation(nums)));
	}

	public static int[] nextPermutation(int[] nums) {

		// Save the first index of nums[i] < nums[k] from right to left
		int i = 0;
		// Save the first index of nums[j] > nums[i] from right to left
		int j = 0;

		// To find the first index of nums[i] < nums[k] from right to left
		for (int k = nums.length - 2; k > 0; k--) {
			if (nums[k] < nums[k + 1]) {
				i = k;
				break;
			}
		}

		// To find the first index of nums[j] > nums[i] from right to left
		for (int l = nums.length - 1; l > 0; l--) {
			if (nums[l] > nums[i]) {
				j = l;
				break;
			}
		}

		// Swap nums[i] and nums[j]
		int swap = nums[i];
		nums[i] = nums[j];
		nums[j] = swap;

		// Reverse the sub array from i + 1 (or 0) to nums.length - 1
		int n = 0;
		if (i == 0 && j == 0) {
			n = 0;
		} else {
			n = i + 1;
		}
		int m = nums.length - 1;
		while (n < m) {
			int temp = nums[n];
			nums[n] = nums[m];
			nums[m] = temp;
			m--;
			n++;
		}
		return nums;
	}
}
