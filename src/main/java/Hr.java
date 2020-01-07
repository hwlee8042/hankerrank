import java.util.ArrayList;
import java.util.List;

public class Hr {
	public static List<Integer> gradingStudents(List<Integer> grades) {
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
	//
	  public static String kangaroo(int x1, int v1, int x2, int v2) {
	      	String result="";
	        int idx=0;
	        if(v2>v1){
	            result="NO";
	        }else{
	            while(x2 > x1 && idx<=10000){
	                idx++;
	                if(x1+v1*idx == x2+v2*idx){
	                   result= "YES";
	                   break;
	                }
	                result="NO";
	            }
	        }
	        return result;
	    }
}

	  
	


