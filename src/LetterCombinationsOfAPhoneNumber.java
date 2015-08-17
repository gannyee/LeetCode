import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import sun.security.krb5.KdcComm;

public class LetterCombinationsOfAPhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("test1: " + letterCombinations("34"));
		System.out.println("test2: " + letterCombinations(""));
		System.out.println("test3: " + letterCombinations("345"));
		System.out.println("test4: " + letterCombinations("3456789"));
	}

	public static List<String> letterCombinations(String digits) {
		
		List<String> result = new ArrayList<String>();
		for(int i = 0;i < digits.length();i ++){
			result = letter(result, digits.charAt(i));
		}
		return result;
	}
	
	public static List<String> letter(List<String> list,char letter){
		HashMap<Character, String> digitMap = new HashMap<Character,String>();
		digitMap.put('2',"abc");
		digitMap.put('3',"def");
		digitMap.put('4',"ghi");
		digitMap.put('5',"jkl");
		digitMap.put('6',"mno");
		digitMap.put('7',"pqrs");
		digitMap.put('8',"tuv");
		digitMap.put('9',"wxyz");
		
		List<String> result = new ArrayList<String>();
		List<String> digitsList = new ArrayList<String>();
		for(int i = 0;i < digitMap.get(letter).length();i ++){
			digitsList.add("" + digitMap.get(letter).charAt(i));
		}
		
		
		if(list.size() == 0){
			return digitsList;
		}
		
		for(int i = 0;i < list.size();i ++){
			for(int j = 0;j < digitsList.size();j ++){
				result.add(list.get(i) + digitsList.get(j));
			}
		}
		return result;
	}
}
