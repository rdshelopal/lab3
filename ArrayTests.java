import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

   // Changes the input array to be in reversed order
   @Test
   public void reverseInPlace2() {

    int[] arr = {1, 2, 3, 4, 5};

    ArrayExamples.reverseInPlace(arr);
    
    assertArrayEquals(new int[] {5,4,3,2,1},arr ); 
  }

  @Test
  public void testAverageWithoutLowest()
  {
    double[] arr = {2,2,2,2};

    assertEquals(2,ArrayExamples.averageWithoutLowest(arr), 0.0);
  }

  
}
