import java.util.Arrays;
/**
 * There are two sorted arrays nums1 and nums2 of size
 *  m and n respectively. Find the median of the two 
 *  sorted arrays. The overall run time complexity 
 *  should be O(log (m+n)).
 * @author ganyee
 *
 */

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums1[] = new int[]{1,3,5,6,8};
		int nums2[] = new int[]{1,7,6,8};

		System.out.println(findMedianSortedArrays(nums1,nums2));
	}
	
	public static double findMedianSortedArrays(int[] nums1,int[] nums2){
		
//		int[] nums3 = new int[nums1.length + nums2.length];
//		for(int i = 0;i < nums1.length;i ++){
//			nums3[i] = nums1[i];
//		}
//		for(int i = nums1.length,j = 0;j < nums2.length;i ++,j ++){
//			nums3[i] = nums2[j];
//		}
//		System.out.println(Arrays.toString(nums3));
//		Arrays.sort(nums3);
//		System.out.println(Arrays.toString(nums3));
//		double medianNums = 0;
//		if(nums3.length  % 2 == 0){
//			medianNums = (nums3[nums3.length / 2] + nums3[nums3.length / 2 + 1]) / 2.0;
//		}else{
//			medianNums =  nums3[nums3.length / 2];
//		}
//		return medianNums;
		
		        int[] nums3 = new int[nums1.length + nums2.length];
				System.arraycopy(nums1, 0,nums3, 0, nums1.length);
				System.arraycopy(nums2, 0,nums3, nums1.length, nums2.length);
			//	System.out.println(Arrays.toString(nums3));
				Arrays.sort(nums3);
			//	System.out.println(Arrays.toString(nums3));
				double medianNums = 0;
				if(nums3.length  % 2 == 0){
					medianNums = (nums3[nums3.length / 2 - 1] + nums3[nums3.length / 2 ]) / 2.0;
				}else{
					medianNums =  nums3[((nums3.length + 1)/ 2) - 1];
				}
				return medianNums;
	}
}
