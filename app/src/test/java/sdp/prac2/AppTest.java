/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    tests for task1
    @Test void task1Test(){
        //Arrange 
        SimpleFunctions testTested = new SimpleFunctions();
        List<Integer> a = Arrays.asList(1,2,3,4);
        List<Integer> b = Arrays.asList(0,1,2,3,4,5,6,7);
        List<Integer> c = Arrays.asList(1,2,3,4);
        List<Integer> d = Arrays.asList(5,1,7,2);
    
        int expected1 = 11; // isnt this meant to be 10? (1 + 2 + 3 + 4)
        int expected2 = 5;
        //Act
        int result1 = testTested.task1(a,b);
        int result2 = testTested.task1(c,d);
        //Assert
        Assert.assertEquals(expected1,result1);
        Assert.assertEquals(expected2,result2);
    }

    TASK 2 tests
    @Test
    public void testTask2() {

        SimpleFunctions Tests = new SimpleFunctions();

        List<String> input = Arrays.asList("hello", "world", "a", "", "testing", "123", "ab");
        List<String> expected = Arrays.asList("ello", "orld", "", "esting", "23", "b");

        List<String> result = Tests.Task2(input);

        assertEquals(expected, result);
    }//TASK 2 tests

    @Test
    public void testTask2EmptyList() {
        List<String> input = Collections.emptyList();
        List<String> expected = Collections.emptyList();

        List<String> result = Task2(input);

        assertEquals(expected, result);
    }//TASK 2 tests


    @Test
    public void testTask5WithSortedArray() {
        List<Integer> sortedList = Arrays.asList(1, 2, 3, 4, 5);
        boolean isSorted = SimpleFunctions.Task5(sortedList);
        assertTrue(isSorted);
    }

    @Test
    public void testTask5WithUnsortedArray() {
        List<Integer> unsortedList = Arrays.asList(3, 1, 4, 2, 5);
        boolean isSorted = SimpleFunctions.Task5(unsortedList);
        assertFalse(isSorted);
    }


}
