import java.util.HashMap;
import java.util.Map;


/**
 * Given a string, find the length of the longest substring 
 * without repeating characters. For example, the longest 
 * substring without repeating letters for "abcabcbb" is 
 * "abc", which the length is 3. For "bbbbb" the longest substring 
 * is "b", with the length of 1.
 * @author ganyee
 *
 */

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongSubstring("adefegehtff"));
	}
	
	public static int lengthOfLongSubstring(String s){
		Map<Character,Integer> str = new HashMap<Character,Integer>();
		int maxLength = 0;
		for(int i = 0;i < s.length();i ++){
			
			if(str.containsKey(s.charAt(i))){
				maxLength = Math.max(str.size(),maxLength);
				i = str.get(s.charAt(i));
				str.clear();
			}else{
				str.put(s.charAt(i), i);
			}
		}
		return Math.max(maxLength,str.size());
	}
}
