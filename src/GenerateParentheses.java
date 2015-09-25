import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenerateParentheses {
	public static void main(String[] args) {
		List<String> list = generateParenthesis(4);
		for(int i = 0;i < list.size();i ++){
			System.out.println(list.get(i));
		}
	}

	public static  List<String> generateParenthesis(int n) {
		List<String> list= new ArrayList<String>();
		String s = "";
		recursion(n, 0, 0, s, list);
		return list;
	}
	
	public static void recursion(int n,int left,int right,String s,List<String> list){
		//When the numbers of left and right's parentheses achieve to n
		if(left == n && right == n){
			list.add(s);
		}
		
		if(left < right){
			return;
		}
		
		if(left == n){
			recursion(n, left, right + 1, s + ')',list);
			return;
		}
		
		recursion(n, left + 1, right, s + '(',list);
		recursion(n, left, right + 1, s + ')',list);
	}
}
