import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
public class ProgrammerDayTest {
	@Test
	public void YeerTestOne() {
		String input = ProgrammerDay.dayOfProgrammer(2017);
		String output = "13.09.2017";
		assertEquals(input,output);
	}
	@Test
	public void YeerTestTwo() {
		String input = ProgrammerDay.dayOfProgrammer(2016);
		String output = "12.09.2016";
		assertEquals(input,output);
	}
	@Test
	public void YeerTestThree() {
		String input = ProgrammerDay.dayOfProgrammer(1800);
		String output = "12.09.1800";
		assertEquals(input,output);
	}
}
