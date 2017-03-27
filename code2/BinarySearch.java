class BinarySearch {
	
	public int binarySearch(int[] array, int key) {
		int start = 0;
		int end = array.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (key == array[mid]) {
				return mid;
			}
			if (key < array[mid]) {
				end = mid - 1;
			} else {
				start = mid +1;
			}
		}
		return -1;
	}
	public static void main(String[] args) { 
		
		BinarySearch bs = new BinarySearch();
		int[] arr = {2, 4, 6, 8, 10, 12, 14, 16,31,66,79,83,89,97,101,103,107,109,113,127,131,137,139,149,151,157,163,167,173,179,181,191,193,197,199};
		int search31 = bs.binarySearch(arr, 31);
		System.out.println("131 position: "+search31);
	}
}
