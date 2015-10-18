import java.util.ArrayList;
import java.util.Arrays;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] nums = new int[]{};
		int[] nums1 = new int[]{4,5};
		int[] nums2 = new int[]{1,2,3,4};
		int[] nums3 = new int[]{1,2,4,5,6,6,6,6,9};
		int[] nums4 = new int[]{1};
		System.out.println(removeElement(nums, 0));
		System.out.println(removeElement(nums1, 4));
		System.out.println(removeElement(nums2, 3));
		System.out.println(removeElement(nums3,6));
		System.out.println(removeElement(nums4, 1));
		
		
	}
	
	public static int removeElement(int[] nums, int val){
	
		/*ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Special case
		if(nums == null || nums.length == 0)
			return 0;
		//Normal case
		for(int i = 0;i < nums.length;i ++){
			if(val != nums[i]){
				list.add(nums[i]);
			}
		}
		
		for(int i = 0;i < list.size();i ++){
			nums[i] = list.get(i);

		}
		return list.size();*/
		int i = 0;
		int j = 0;
		while(j < nums.length){
			if(nums[j] != val){
				nums[i] = nums[j];
				i ++;
			}
			j ++;
		}
		System.out.println(Arrays.toString(nums));
		return i;
	}

}
