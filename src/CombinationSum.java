import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CombinationSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[]{2,3,6,7};
		System.out.println(combinationSum(nums,7));
	}

	public static ArrayList<ArrayList<Integer>> combinationSum(int[] candidates, int target) {

		ArrayList<Integer> subRes = new ArrayList<Integer>();
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();

		// Special case
		if (candidates.length == 0 || candidates == null)
			return result;

		// Sort array before find combination
		Arrays.sort(candidates);
		// Recursive DFS
		recursionFunction(candidates, 0, target, subRes, result);
		return result;
	}

	public static void recursionFunction(int[] candidates, int begin, int target, ArrayList<Integer> subRes,
			ArrayList<ArrayList<Integer>> result) {

		if (target < 0)
			return;
		else if (target == 0) {
			// Have to redeclarat subRes as ArrayList<Integer> or can't get
			// resSub
			result.add(new ArrayList<Integer>(subRes));
			return;
		} else {
			for (int i = begin; i < candidates.length; i++) {
				// To eliminate repeate elment of candidates
				if (i > 0 && candidates[i] == candidates[i - 1])
					continue;
				subRes.add(candidates[i]);
				recursionFunction(candidates, i, target - candidates[i], subRes, result);
				subRes.remove(subRes.size() - 1);
			}
		}
	}

}
