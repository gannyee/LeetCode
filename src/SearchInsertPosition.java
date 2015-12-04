import java.util.Arrays;

public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,2,3,8,9};
		Integer target = 7;
		System.out.println(searchInsert(nums, target));
	}

	public static int searchInsert(int[] nums, int target) {

		// Binary Search
		int left = 0;
		int right = nums.length - 1;

		while (left <= right) {
			int middle = (left + right) / 2;

			if (nums[middle] == target)
				return middle;
			else if (nums[middle] < target) {
				left = middle + 1;
			} else if (nums[middle] > target) {
				right = middle - 1;
			} else if (nums[middle] < target && nums[middle + 1] > target) {
				return middle;
			}

		}
		return left;
/*
		// tow points search
		int left = 0;
		int right = nums.length - 1;
		// flag for whether nums[left] > target or nums[right] < target
		int flag = 0;
		// save index of target
		int index = 0;
		while (left <= right) {
			// when nums's length == 1
			if (left == right) {
				if (nums[left] > target)
					return left;
				else if (nums[left] < target)
					return left + 1;
				else
					return left;
			}
			// find target,then save left to index
			else if (nums[left] == target) {
				index = left;
				break;
			}
			// find target,then save right to index
			else if (nums[right] == target) {
				index = right;
				break;
			}
			// when nums[left] < target, if nums[left + 1] > target, target not
			// exsist
			else if (nums[left] < target) {
				left++;
				flag = 1;
			} else if (flag == 1 && nums[left] > target) {
				index = left;
				break;
			}
			// when nums[right] > target, if nums[right - 1] < target, target
			// not exsist
			else if (nums[right] > target) {
				right--;
				flag = 1;
			} else if (flag == 1 && nums[right] < target) {
				index = right;
				break;
			}
		}
		return index;*/

	}

}
