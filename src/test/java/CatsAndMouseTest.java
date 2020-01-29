import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;

import org.junit.Test;

public class CatsAndMouseTest {
	@Test
	public void TestCatAndMouseOne(){
		CatsandMouse catching = new CatsandMouse();
        assertThat(catching.catchCatAndMouse(1,3,2), is("Mouse C"));
   }
	@Test
	public void TestCatAndMouseTwo(){
		 CatsandMouse catching = new CatsandMouse();
	     assertThat(catching.catchCatAndMouse(1,2,3), is("Cat B"));
	   }
}
