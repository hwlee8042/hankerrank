import java.util.ArrayList;
import java.util.List;

public class hr {
	public static List<Integer> gradingStudents(List<Integer> grades) {
	    // Write your code here
			ArrayList<Integer> fn = new ArrayList<>();
	        int score=0;
	        for (int i = 0; i<grades.size();i++){
	        	if (grades.get(i) < 38){
	                 score = grades.get(i);
	                }else{
	                    int temp=grades.get(i)/5;
	                    temp++;
	                    int g=temp*5;
	                    if(g-grades.get(i)<3){
	                         score = g;
	                    }else{
	                    score=grades.get(i);
	                    }
	                }
	         fn.add(score);
	        }
	        return fn;
		}
	}


