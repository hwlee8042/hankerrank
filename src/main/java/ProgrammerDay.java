
public class ProgrammerDay {
	
	static final String leap="12.09.";
	static final String nleap="13.09.";

	static String dayOfProgrammer(int year) {
	     if (year == 1918)
	            return "26.09.1918";
	     else if(year<1918)
	            return juliancalendar(year);
	     else
	            return gregoriancalendar(year);
	}
	
	static String juliancalendar(int year){
	     return (year%4==0) ? leap+year : nleap+year;
	}
	
	static String gregoriancalendar(int year){
	     return ((year%4==0&&year%100!=0) || (year%400==0)) ? leap+year : nleap+year;
	}

}
