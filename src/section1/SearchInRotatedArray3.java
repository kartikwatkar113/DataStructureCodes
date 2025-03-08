package section1;
//given a sorted and rotated array A of N distinct elements which is
// rotated at some point, and given key. The taks is to find 
// the index of the given element key in the array A.
public class SearchInRotatedArray3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(search(new int[] {5,6,7,8,9,10,1,2,3},0,8,10));

	}
	private static int search(int arr[], int l, int r, int key) {
		int pivot=getPivot(arr,l,r);
		int e=binarySearch(arr,l,pivot,key);
		if(e==-1) {
			e=binarySearch(arr,pivot+1,r,key);
		}
		return e;
	}
	private static int binarySearch(int[] arr, int l, int r, int x) {
		// TODO Auto-generated method stub
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]==x) {
				return mid;
			}else if(arr[mid]<x) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		return -1;
	}
	private static int getPivot(int[] arr, int l, int r) {
		// TODO Auto-generated method stub
		
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]>arr[mid+1]) {
				return mid;
			}else if(arr[mid]<arr[mid-1]) {
				return mid-1;
			}else if(arr[mid]>arr[l]) {
				l=mid+1;
			}else {
				r=mid-1;
			}
		}
		return -1;
	}

}
