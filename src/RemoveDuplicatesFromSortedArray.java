import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{1,1,2};
		System.out.println("nums: " + removeDuplicates(nums));
		System.out.println("---------------------");
		int[] nums1 = new int[]{};
		System.out.println("nums1: " + removeDuplicates(nums1));
		System.out.println("---------------------");
		int[] nums2 = new int[]{1,1,1,1};
		System.out.println("nums2: " + removeDuplicates(nums2));
		System.out.println("---------------------");
		int[] nums3 = new int[]{1,2,3,4,4,5,6,7,8,9};
		System.out.println("nums3 " + removeDuplicates(nums3));
	}
	
	public static int removeDuplicates(int [] nums){
		
		//Special case:
		if(nums.length == 0 || nums == null)
			return 0;
		
		//Normal case:
		int count = 0;
		
		for(int i = 0;i < nums.length;i ++){
			if(nums[i] != nums[count]){
				nums[++count] = nums[i];
				
				System.out.println(Arrays.toString(nums) + " : " + count);
			}
		}
		return count + 1;
	}
}
