import java.util.List;

public class BirthdayChocolate {
	 public int birthday(List<Integer> s, int d, int m) {
		   int count = 0;
	       int sum = 0;
	       
	       sum = sumFirst(s, m, sum);
	       count = check(d, count, sum)+sumNext(s,d,m,count,sum);
	       
	       return count;
	 }

	private int sumFirst(List<Integer> s, int m, int sum) {
		for(int i = 0; i < m; i++)
		    sum += s.get(i);
		return sum;
	}
	
	private int sumNext(List<Integer> s, int d, int m, int count, int sum) {
		for(int i = 0; i < s.size()-m; i++)
        {
            sum = sum - s.get(i) + s.get(i+m);
            count+= check(d, count, sum);
        }
		return count;
	}
	
	private int check(int d, int count, int sum) {
		return sum==d?1:0;
	}
}
