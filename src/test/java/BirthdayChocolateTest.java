import java.util.ArrayList;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class BirthdayChocolateTest {
	@Test
	public void TestChocobarOne(){
       ArrayList<Integer> s = new ArrayList<>();
       s.add(1);
       s.add(2);
       s.add(1);
       s.add(3);
       s.add(2);
    
       BirthdayChocolate choco = new BirthdayChocolate();
       assertThat(choco.birthday(s, 3, 2), is(2));
   }
	@Test
	public void TestChocobarTwo(){
	       ArrayList<Integer> s = new ArrayList<>();
	       s.add(1);
	       s.add(1);
	       s.add(1);
	       s.add(1);
	       s.add(1);
	       s.add(1);
	    
	       BirthdayChocolate choco = new BirthdayChocolate();
	       assertThat(choco.birthday(s, 3, 2), is(0));
	   }
	  @Test
	  public void TestChocobarThree(){
	       ArrayList<Integer> s = new ArrayList<>();
	       s.add(4);
	     
	    
	       BirthdayChocolate choco = new BirthdayChocolate();
	       assertThat(choco.birthday(s, 4, 1), is(1));
	   }
}
