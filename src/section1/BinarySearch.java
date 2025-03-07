package section1;


//for binary search:- 1. array should be linear
//                    2. duplicates not allowed   
public class BinarySearch {

	public static void main(String[] args) {
		System.out.println(getBinarySearchIndex(new int[] {2,4,5,6,7,8,9}, 4));
	}
	
	public static int getBinarySearchIndex(int arr[],int value) {
		int left=0;              // 2 4 5 7 8 9
		int right=arr.length-1;
		
		while(left<=right) {
			int mid=(left+right)/2;
			if(arr[mid]==value) {
				return mid;
			}else if(value<arr[mid]) {
				right=mid+1;
			}else {
				left=mid-1;
			}
		}
		
		return -1;
	}
}
