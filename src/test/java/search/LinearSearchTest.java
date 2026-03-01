package search;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class LinearSearchTest {
    
    LinearSearch search = new LinearSearch();
    
    @Test
    void testFoundElement() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(2, search.search(8, arr));
    }
    
    @Test
    void testNotFoundElement() {
        int[] arr = {5, 2, 8, 1, 9};
        assertEquals(-1, search.search(7, arr));
    }
    
    @Test
    void testFirstElement() {
        int[] arr = {10, 20, 30, 40};
        assertEquals(0, search.search(10, arr));
    }
    
    @Test
    void testLastElement() {
        int[] arr = {10, 20, 30, 40};
        assertEquals(3, search.search(40, arr));
    }
    
    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, search.search(5, arr));
    }
    
    @Test
    void testNullArray() {
        assertEquals(-1, search.search(5, null));
    }
}
