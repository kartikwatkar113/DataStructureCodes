package section1;

public class DecimalToBinaryViceVersa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(decimalToBinary(123).toString());
		System.out.println(binaryToDecimal("1111011"));
	}
	
	private static StringBuffer decimalToBinary(int n) {
		String res="";
		while(n>0) {
			int rem=n%2;
			n=n/2;
			res=res+" "+rem;
		}
		return new StringBuffer(res).reverse();
	}
	
	private static int binaryToDecimal(String str) {
		int m=1;
		int res=0;
		for(int i=str.length()-1; i>=0; i--) {
			char ch=str.charAt(i);
			System.out.println(ch);
			Integer num=Integer.valueOf(String.valueOf(ch));
			res=res+m*num;
			m=m*2;
		}
		
		return res;
	}

}
