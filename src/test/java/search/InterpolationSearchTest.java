package search;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class InterpolationSearchTest {
    
    InterpolationSearch search = new InterpolationSearch();
    
    @Test
    void testFoundElement() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        assertEquals(3, search.search(40, arr));
    }
    
    @Test
    void testNotFoundElement() {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        assertEquals(-1, search.search(45, arr));
    }
    
    @Test
    void testFirstElement() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(0, search.search(10, arr));
    }
    
    @Test
    void testLastElement() {
        int[] arr = {10, 20, 30, 40, 50};
        assertEquals(4, search.search(50, arr));
    }
    
    @Test
    void testEmptyArray() {
        int[] arr = {};
        assertEquals(-1, search.search(25, arr));
    }
    
    @Test
    void testSingleElement() {
        int[] arr = {42};
        assertEquals(0, search.search(42, arr));
    }
    
    @Test
    void testUniformDistribution() {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        assertEquals(5, search.search(12, arr));
    }
}
