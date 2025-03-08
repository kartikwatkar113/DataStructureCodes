package section1;

public class RemoveDuplicatesFromSortedArray6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getModifiedArray(new int[] {1,2,2,3,4,5,5,6,7});

	}
	
	private static void getModifiedArray(int arr[]) { 
		int unique=1;//1,2,2,3,4,5,5,6,7
		for(int i=1; i<arr.length; i++) {
			if(arr[i]!=arr[i-1]) {
				unique+=1;
				arr[unique-1]=arr[i];
			}
		}
		
		for(int i=0; i<unique; i++) {
			System.out.println(arr[i]);
		}
	}

}
