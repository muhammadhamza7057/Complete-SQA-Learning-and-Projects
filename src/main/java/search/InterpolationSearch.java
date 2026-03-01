package search;

public class InterpolationSearch {
    
    /**
     * Performs interpolation search on a sorted array with uniformly distributed values
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
        
        while (left <= right && target >= arr[left] && target <= arr[right]) {
            // If array has only one element
            if (left == right) {
                if (arr[left] == target) {
                    return left;
                }
                return -1;
            }
            
            // Probe position using interpolation formula
            int pos = left + ((target - arr[left]) * (right - left)) / (arr[right] - arr[left]);
            
            if (arr[pos] == target) {
                return pos;
            }
            
            if (arr[pos] < target) {
                left = pos + 1;
            } else {
                right = pos - 1;
            }
        }
        
        return -1;
    }
}
