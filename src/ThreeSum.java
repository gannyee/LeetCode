import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader.Array;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class ThreeSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] s = new int[] { 7, -1, 14, -12, -8, 7, 2, -15, 8, 8, -8, -14, -4,
				-5, 7, 9, 11, -4, -15, -6, 1, -14, 4, 3, 10, -5, 2, 1, 6, 11,
				2, -2, -5, -7, -6, 2, -15, 11, -6, 8, -4, 2, 1, -1, 4, -6, -15,
				1, 5, -15, 10, 14, 9, -8, -6, 4, -6, 11, 12, -15, 7, -1, -9, 9,
				-1, 0, -4, -1, -12, -2, 14, -9, 7, 0, -3, -4, 1, -2, 12, 14,
				-10, 0, 5, 14, -1, 14, 3, 8, 10, -8, 8, -5, -2, 6, -11, 12, 13,
				-7, -12, 8, 6, -13, 14, -2, -5, -11, 1, 3, -6 };
		System.out.println(" A solution set is: ");
		ArrayList<ArrayList<Integer>> listArray = new ArrayList<ArrayList<Integer>>();
		listArray = threeSum(s);
		for (int i = 0; i < listArray.size(); i++) {
			System.out.println(listArray.get(i));
		}
	}

	public static ArrayList<ArrayList<Integer>> threeSum(int[] nums) {
		/*ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		String string = "";
		ArrayList<String> string1 =new ArrayList<String>();
		int[] b = new int[3];
		for(int i = 0;i < nums.length;i ++){
			for(int j = i + 1;j < nums.length;j ++){
				for(int k = j + 1;k < nums.length;k ++){
					ArrayList<Integer> element = new ArrayList<Integer>();
					if(nums[k] + nums[j] + nums[i] == 0){
						string  = "";
						element.add(nums[i]);
						element.add(nums[j]);
						element.add(nums[k]);
						
						b[0] = nums[i];
						b[1] = nums[j];
						b[2] = nums[k];
						
						Arrays.sort(b);
						for(int n = 0;n < b.length;n ++){
							string = string + b[n];
						}
						if(!string1.contains(string)){
							list.add(element);
							string1.add(string);
						}
					}
				}
			}
		}
		return list;*/
		
		ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
		HashSet<ArrayList<Integer>> elementSet = new HashSet<ArrayList<Integer>>();
		int sum = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {
			
			int left = i + 1;
			int right = nums.length - 1;
			while (left < right) {
				sum = nums[i] + nums[left] + nums[right];
				if(sum == 0){
					ArrayList<Integer> element = new ArrayList<Integer>();
					element.add(nums[i]);
					element.add(nums[left]);
					element.add(nums[right]);
					if(!elementSet.contains(element)){
						list.add(element);
						elementSet.add(element);
					}
					left ++;
					right --;
				}else if(sum < 0){
					left ++;
				}else{
					right --;
				}
			}
		}
		return list;
	}
}
