package SortingAndSearching;

//Java implementation of recursive Binary Search
public class BinarySearch {
	public static void main(String []argv)
	{
		int []list = {2,5,6,8,13,16};
		int anwser = (new BinarySearch()).binarySearch(list, 0, list.length, 6);
		System.out.println(anwser);
	}

	private int binarySearch(int[] list, int i, int j, int m)
	{
		if (i <= j) {
			int k = i+(j-1)/2;
			
			if (m > list[k]) {
				return binarySearch(list, k+1, j, m);
			} else if (m < list[k]) {
				return binarySearch(list, i, k-1, m);
			} else {
				return (k);
			}
		}
		return(-1);
	}
}
