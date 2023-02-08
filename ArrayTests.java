import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = {3};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{3 }, input1);
	}

  @Test
  public void testReverseInPlaceFail(){
  int[] input1 = {};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{}, input1);
  }


  @Test
  public void testReversedCase() {
    int[] input1 = {};
    assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
  }


  @Test
  public void testAverageWithoutLowest()
  {
    double[] arr = {2,2,2,2};

    assertEquals(2,ArrayExamples.averageWithoutLowest(arr), 0.0);
  }

  
}
