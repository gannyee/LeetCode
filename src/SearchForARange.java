import java.util.Arrays;

public class SearchForARange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,1,2};
		Integer target = 1;
		System.out.println(Arrays.toString(searchRange(nums, target)));
	}

	public static int[] searchRange(int[] nums, int target) {

		/*int[] array = new int[] { -1, -1 };

		// tow points for search nums[left] == target and nums[right] == target
		int left = 0;
		int right = nums.length - 1;
		// flagL for left index is found and flagR for right index is found
		int flagL = 0;
		int flagR = 0;

		// Find left index
		while (left <= right) {

			if (flagL == 0 && nums[left] == target) {
				array[0] = left;
				flagL = 1;
				break;
			} else {
				left++;
			}

		}

		// Find right index
		while (right >= left) {

			if (flagR == 0 && nums[right] == target) {
				array[1] = right;
				flagR = 1;
				break;
			} else {
				right--;
			}
		}

		// No find target
		if (flagL == 0 && flagR == 0) {
			return array;
		}

		return array;*/

		int left = 0;
		int right = nums.length - 1;
		//term, termq for termporary variable, save the first middle
		int tem = 0;
		int tem1 = 0;
		//sign whether find target
		int flag = 0;
		int[] array = new int[] { -1, -1 };
		
		//Binary search to find first middle nums[middle] = target
		while (left <= right) {
			int middle = (left + right) / 2;
			if (nums[middle] == target) {
				tem = middle;
				tem1 = middle;
				flag = 1;
				break;
			} else if (nums[middle] < target) {
				left = middle + 1;
			} else {
				right = middle - 1;
			}
		}

        //if not return[-1,-1]
		if (flag == 0) {
			return array;
		}
        
        //find the right boundary
		if(tem != nums.length - 1){
			while (tem < nums.length) {
				if ((tem + 1 < nums.length) && nums[tem] == nums[tem + 1]) {
					tem++;
				} else {
					array[1] = tem;
					break;
				}
			}
		}else{
			array[1] = tem;
		}
		
		//find left boundary
		if(tem1 != 0){
			while (tem1 > -1) {
				if ((tem1 - 1 > -1) && nums[tem1] == nums[tem1 - 1]) {
					tem1--;
				} else {
					array[0] = tem1;
					break;
				}
			}
		}else{
			array[0] = tem1;
		}

		return array;
	}

}
