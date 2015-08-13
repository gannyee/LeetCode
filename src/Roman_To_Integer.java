import java.util.HashMap;

import sun.print.resources.serviceui;

public class Roman_To_Integer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "MMCMLXXXIV";
		//String s = "MMMCMXCIX";
		System.out.println("roman to int: " + romanToInt(s));
	}

	public static int romanToInt(String s) {

		//Genericity to set table to search for
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int num = 0;
		for (int i = 0; i < s.length(); i++) {
			if (i + 1 <= s.length() - 1 && (map.get(s.charAt(i)) < map.get(s.charAt(i + 1)))) {
				num = num + map.get(s.charAt(i + 1)) - map.get(s.charAt(i));
			//	System.out.println("flag1: " + num + "   " + s.charAt(i) + "  " + s.charAt(i + 1));
				i ++;//When the (i + 1)th lager than (i)th i have to plus 1 to skip the (i + 1)th witch have included
			} else {
				num = num + map.get(s.charAt(i));
			//	System.out.println("flag2: " + num + "   "  + s.charAt(i));
			}
		}

		return num;
	}
}
