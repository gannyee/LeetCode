public class Regular_Expression_Matching {
	public static void main(String[] args) {

	}

	public boolean isMatch(String s, String p) {
		
		if(!p.contains(".") && !p.contains("*")){
			if(s == p)
				return true;
		}
		else if(p.contains(".") || p.contains("*")){
			for(int i = 0,j = 0;i < s.length() && j < p.length();i ++,j ++ ){
				if(p.charAt(j) != '.' || p.charAt(j) != '*'){
					
				}
			}
		}
		return true;
	}
}
