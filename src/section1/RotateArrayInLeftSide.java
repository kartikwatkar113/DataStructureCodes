package section1;

import java.util.Arrays;

public class RotateArrayInLeftSide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,3,4,5,6};
		rotateByLeftSide(arr, arr.length-1, 2);
		System.out.println(Arrays.toString(arr));
	}
	
	public static void rotateByLeftSide(int arr[],int size, int point) {
		reverseArray(arr, 0, point-1);
		reverseArray(arr, point, size);
		reverseArray(arr, 0, size);
	}
	
	public static void reverseArray(int arr[], int i1 , int j) {
		for(int i=i1; i<=j; i++,j--) {
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;	
		}
	}

}
