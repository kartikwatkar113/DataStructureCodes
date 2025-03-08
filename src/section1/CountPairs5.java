package section1;

import java.util.Arrays;
import java.util.List;

public class CountPairs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getCountedPairs(Arrays.asList(-1,1,2,3,1),2));
	}

	private static int getCountedPairs(List<Integer> nums,int target) {
		// TODO Auto-generated method stub
		int res=0;
		nums.sort((a,b)->a-b);
		int l=0;
		int r=nums.size()-1;
		
		while(l!=r) {
			if(nums.get(l)+nums.get(r)<target) {
				res+=r-l;
				l++;
			}else {
				r--;
			}
		}
		return res;
	}

}
