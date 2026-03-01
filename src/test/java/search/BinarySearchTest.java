package search;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {
    
    BinarySearch search = new BinarySearch();
    
    @Test
    void testFoundElement() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(3, search.search(7, arr));
    }
    
    @Test
    void testNotFoundElement() {
        int[] arr = {1, 3, 5, 7, 9, 11, 13};
        assertEquals(-1, search.search(6, arr));
    }
    
    @Test
    void testFirstElement() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(0, search.search(1, arr));
    }
    
    @Test
    void testLastElement() {
        int[] arr = {1, 3, 5, 7, 9};
        assertEquals(4, search.search(9, arr));
    }
    
    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, search.search(5, arr));
    }
    
    @Test
    void testSingleElement() {
        int[] arr = {5};
        assertEquals(0, search.search(5, arr));
    }
}
