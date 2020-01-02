import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertThat;


public class hrTest {
	@Test
    public void gradeStudentTest(){
         ArrayList<Integer> input = new ArrayList<>();
         input.add(73);
         input.add(67);
         input.add(38);
         input.add(33);
         List<Integer> b= new ArrayList<>();
         b.add(75);
         b.add(67);
         b.add(40);
         b.add(33);

         assertThat(hr.gradingStudents(input), is(b));
     }
	@Test
    public void gradeStudentTest2(){
         ArrayList<Integer> input = new ArrayList<>();
         input.add(73);
         input.add(67);
         input.add(38);
         input.add(33);
         List<Integer> b= new ArrayList<>();
         b.add(75);
         b.add(67);
         b.add(40);
         b.add(33);

         assertThat(hr.gradingStudents2(input), is(b));
     }
}
