import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class KSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[] s = new int[] {1,0,-1,0,-2,2 };
		int[] s = new int[]{-500,-490,-471,-456,-422,-412,-406,-398,-381,-361,-341,-332,-292,-288,-272,-236,-235,-227,-207,-203,-185,-119,-59,-13,4,5,46,72,82,91,92,130,130,140,145,159,187,207,211,226,239,260,262,282,290,352,377,378,386,405,409,430,445,478,481,498};
		System.out.println(" A solution set is: ");
		List<List<Integer>> listArray = new ArrayList<List<Integer>>();
		listArray = kSum(s,-3213);
		for (int i = 0; i < listArray.size(); i++) {
			System.out.println(listArray.get(i));
		}
	}

	public static List<List<Integer>> kSum(int[] nums, int target) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		result = recursionRoutin(nums,0,4,0);
		return result;
	}
	
	public static List<List<Integer>> recursionRoutin(int[] nums,int begin,int k,int target){
		HashSet<List<Integer>> elementSet = new HashSet<List<Integer>>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<List<Integer>> subResult = new ArrayList<List<Integer>>();
		if(k == 2){
			int left = begin;
			int right = nums.length - 1;
			while(left < right){
				int sum = nums[left] + nums[right];
				if(sum == target){
					List<Integer> taplet = new ArrayList<Integer>();
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
			return result;
		}else{
				
			for(int i = begin;i < nums.length - k - 1;i ++){
				subResult = recursionRoutin(nums,i + 1,k - 1,target - nums[i]);
				//System.out.println(k + " " + subResult);
				if(!subResult.isEmpty()){
					for(int j = 0;j < subResult.size();j ++){
						subResult.get(j).add(nums[i]);
						result.add(subResult.get(j));
					}
				}
			}
		}
		return result;
	}
}
