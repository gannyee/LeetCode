import java.util.ArrayList;

public class ImplementStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(strStr("abcdefgabcdefg", "gab"));
		System.out.println(strStr("", "a"));
	}

	public static int strStr(String haystack, String needle) {
        ArrayList<String> str = new ArrayList<String>();
        
        if(haystack.length() == 0 && needle.length() == 0){
            return 0;
        }
        for(int i = 0;i < haystack.length() - needle.length() + 1;i ++){
            str.add(haystack.substring(i, i + needle.length()));
        }
       System.out.println("Result: " + str);
       return str.indexOf(needle);
    }
}
