import java.util.ArrayList;
import java.util.List;

public class hr2 {
  public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        ArrayList<Integer> fn = new ArrayList<>();
        int score=0;
        for (int i=0; i<grades.size();i++){
            if(grades.get(i)<38){
                score=grades.get(i);
            }else{
                int temp=5-grades.get(i)%5;
                if(temp<3){
                    score=grades.get(i)+temp;
                }else{
                    score=grades.get(i);
                }
            }
            fn.add(score);
        }
        return fn;
    }

}
