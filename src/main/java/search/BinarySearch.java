package search;

public class BinarySearch {
    
    /**
     * Performs binary search on a sorted array
     * @param target the element to search for
     * @param arr the sorted array to search in
     * @return the index of the target element, or -1 if not found
     */
    public int search(int target, int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1;
        }
        
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] == target) {
                return mid;
            }
            
            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        
        return -1;
    }
}
