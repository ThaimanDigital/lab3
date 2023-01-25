import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1,2,3};
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(input2, new int[]{1,2,3});
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  
    int[] input2 = {1,2,3};
    assertArrayEquals(ArrayExamples.reversed(input2), new int[]{3,2,1});
  }

  @Test 
  public void testAverageWithoutLowest() {
    double[] input1 = {1.2, 1.3, -2, 4};
    assertEquals(ArrayExamples.averageWithoutLowest(input1), 2.167, 0.1);

    double[] input2 = {1.1, 1.1, 1.1, 5};
    assertEquals(ArrayExamples.averageWithoutLowest(input2), 2.4, 0.1);

  
    //Leeza's Test
    double[] input3 = {3};
    assertEquals(ArrayExamples.averageWithoutLowest(input3), 0, 0.1);
  }
}
