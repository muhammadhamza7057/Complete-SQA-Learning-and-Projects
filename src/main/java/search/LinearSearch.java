package search;

public class LinearSearch {
    
    /**
     * Performs linear search on an array
     * @param target the element to search for
     * @param arr the array to search in
     * @return the index of the target element, or -1 if not found
     */
    public int search(int target, int[] arr) {
        if (arr == null) {
            return -1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        
        return -1;
    }
}
