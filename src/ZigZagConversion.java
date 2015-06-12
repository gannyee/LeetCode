/**
 * 
 * @author ganyee The string "PAYPALISHIRING" is written in a zigzag pattern on
 *         a given number of rows like this: (you may want to display this
 *         pattern in a fixed font for better legibility) P A H N A P L S I I G
 *         Y I R And then read line by line: "PAHNAPLSIIGYIR" Write the code
 *         that will take a string and make this conversion given a number of
 *         rows: string convert(string text, int nRows);
 *         convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".
 */
public class ZigZagConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out
				.println(convert(
						"ikicnhlvnsnklobqkfoifwsdzfgoueicotgearzqloawcbomgcwnyosztzoqdyutrbxsuzignicqkresvbgwravnzjdekzabaxvvwddmoheaaiuwlcuddpqebvjlwjmxiiuhnztdgzfhhaftczyhoqmrnxcjirisbezqduuktztdbywezwlnmzfzwjkgatzdxaubvolqpgtrerxdpksbmzckjnrlgqpdqjgnztgqzbjftgkktdmfeqppdgdlysrrdxgermuqogyjmithlhmsychdkkpleicjfinyxkrlqpuexpmlxydvcmapxradzcnfmafjmwwcnqhlityftdcypenownsvrfcdhipuglwuefhmahtwkxuzbhqxuivnnxquhhootnkxstlvaermblnesdcolxbawtvebluuagttbeqbihnlucpmgtcrsdupypvzcrvdxoyysobcxqprshfyahsvmmmkdhmhahkxykxsaavxqkokrvlucfpqtbbwkpfkyqjwcipdimaayrmsmxmredhxgkvqzbcytluvvlydxbfyurqirezvhjtptohtrjtkwngrbgwyjbwdsomjsnfbwaqqqxligeseravujrvsutynimyazdcwfsmwszeadyfwbarmumgofednqcqshuonoclgbrhepmasorgkfnblteamisesmshbwshxjqdaeftvzzfeogrinsuvkapzswaqojpxcuagzvbywhflpwveqpcdprcjoebepqcrkeyjzbkvkrganbggsiljapsqtvuilycxcajbdtxokfqzhwfbfslhhfxabtlmspkuptyuoxiacyzjxhlezylhdkjefwtxlfucyuxorhotipffysjyqwhtisynrtley",
						158));
		System.out.println(convert("PAYPALISHIRING", 3));
	}

	/*
	 * public static String convert(String s, int numRows) { int icount = 2 *
	 * (numRows - 1); String newStr = ""; if(numRows < 2 || s.length() <= 1)
	 * return s; else{ for(int i = 0;i < numRows;i ++){
	 * 
	 * for(int j = i;j < s.length();j += icount){ newStr += s.charAt(j); int mid
	 * = j + icount - 2 * i;
	 * 
	 * if(i != 0 && i != numRows - 1 && mid >= 0 && mid < s.length()){ newStr +=
	 * s.charAt(mid); } } } return newStr; }
	 * 
	 * }
	 */
	public static String convert(String s, int numRows) {

		StringBuffer[] str = new StringBuffer[numRows];
		boolean down = true;
		int j = 0;
		if (s.length() <= 1 || numRows <= 1)
			return s;

		for (int i = 0; i < str.length; i++)
			str[i] = new StringBuffer();
		for (int i = 0; i < s.length(); i++) {

			str[j].append(s.charAt(i));
			if (j == 0)
				down = true;
			else if (j == numRows - 1)
				down = false;
			if (down)
				j++;
			else
				j--;
		}
		StringBuffer newStr = new StringBuffer();
		for (StringBuffer string : str)
			newStr.append(string.toString());

		return newStr.toString();
	}

}
