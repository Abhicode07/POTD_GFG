class Solution{

    public static int grayToBinary(int n) {
        if(n==0){
            return 0;
        }
        //convert n to binary
		String nb = "";
		while(n>0) {
			if((n&1)==0) {
				nb="0"+nb;
			}else {
				nb="1"+nb;
			}
			n>>=1;
		}
		//convert to gray code
		String grayCode = "1";
		char gray = '1';
		for(int i=1;i<nb.length();i++) {
			if(nb.charAt(i)==gray) {
				grayCode += "0";
				gray = '0';
			}else {
				grayCode += "1";
				gray = '1';
			}
			 
		}

		//convert grayCode Binary form  to Decimal
		int ans = 0;
		for(int i=0;i<grayCode.length();i++) {
			ans += Math.pow(2, grayCode.length()-i-1) * (grayCode.charAt(i)-'0');
		}
		
		return ans;
    }
       
