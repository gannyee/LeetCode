public class IntegeToRoman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 50;
		System.out.println("Int to Roman: " + intToRoman(num));
		int num1 = 501;
		System.out.println("Int to Roman: " + intToRoman(num1));
		int num2 = 3999;
		System.out.println("Int to Roman: " + intToRoman(num2));
		int num3 = 2134;
		System.out.println("Int to Roman: " + intToRoman(num3));
	}

	public static String intToRoman(int num) {
		
		int t = num / 1000; //Save the thousand
		int h = (num - t * 1000) / 100; //Save the hundred
		int d = (num - t * 1000 - h * 100) / 10; //Save the decimal
		int u = num - t * 1000 - h * 100 - d * 10; // Save the unit
		
		String romanString = "";
		
		//Calculate the thousand
		for(int i = 0;i < t;i ++)
			romanString = romanString + 'M';
		//Calculate the hundred
		if(100 <= h * 100 && h * 100 <= 300){
			for(int i = 0;i < h;i ++)
				romanString = romanString + 'C';
		}else if(h * 100 == 400){
			romanString = romanString + "CD";
		}else if(500 <= h * 100 && h * 100 <= 800){
			romanString = romanString + 'D';
			for(int i = 0;i < h % 5;i ++)
				romanString = romanString + 'C';
		}else if(h * 100 == 900){
			romanString = romanString + "CM";
		}
		
		//Calculate the decimal
		if(10 <= d * 10 && d * 10 <= 30){
			for(int i = 0;i < d;i ++)
				romanString = romanString + 'X';
		}else if(d * 10 == 40){
			romanString = romanString + "XL";
		}else if(50 <= d * 10 && d * 10 <= 80){
			romanString = romanString + 'L';
			for(int i = 0;i < d % 5;i ++)
				romanString = romanString + 'X';
		}else if(d * 10 == 90){
			romanString = romanString + "XC";
		}
		
		//Calculate the unit
		if(1 <= u && u <= 3){
			for(int i = 0;i < u;i ++)
				romanString = romanString + 'I';
		}else if(u == 4){
			romanString = romanString + "IV";
		}else if(5 <= u && u <= 8){
			romanString = romanString + 'V';
			for(int i = 0;i < u % 5;i ++)
				romanString = romanString + 'I';
		}else if(u == 9){
			romanString = romanString + "IX";
		}
		
		return romanString;
		
		/*//Other solution
		if(num < 1 || num > 3999){  
            return "-1";  
        }  
   
        int[] aArray = {1000,900,500,400,100,90,50,40,10,9,5,4,1};  
        String[] rArray = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};  
        String rNumber = "";  
   
        for(int i=0; i<aArray.length; i++){  
            while(num >= aArray[i]){  
                rNumber += rArray[i];  
                num -= aArray[i];  
            }  
        }  
   
        return rNumber;  */
	}

}
