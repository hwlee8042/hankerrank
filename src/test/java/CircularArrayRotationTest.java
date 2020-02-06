import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.junit.Test;
public class CircularArrayRotationTest {
	@Test
	public void testOne(){
	CircularArraRotation arrayRotation = new CircularArraRotation();
 
        int[] a = {1, 2, 3};
        int[] queries = {0, 1, 2};
        int[] expect = {2, 3, 1};
        int[] result = arrayRotation.circularArrayRotation(a, 2, queries);

        assertThat(expect, is(result));
   }
}
