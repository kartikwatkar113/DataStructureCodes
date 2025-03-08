package section1;
//Divisible and non Divisible sums Difference

public class DifferenceOfSums4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* n=10 m=3
		   [1,2,3,4,5,6,7,8,9,10] find out sum of the divisible
		   by 3 so that is [1,2,4,5,7,8,10] =37
		   this is for num1 condition.
		   
		   for num2:- divisible by 3 that is [3,6,9] so addition will be
		   18.        
		   so their difference is num1-num2 i.e 37-18=19.
		 	
		*/
		System.out.println(getDifference(10,3));
	}
	private static int  getDifference(int n, int m) {
		// TODO Auto-generated method stub
		int x=n/m;
		int num2=m*x*(x+1)/2;
		int num1=n*(n+1)/2 - num2;
		return num1-num2;
	}

}
