public class CatsandMouse {
	 public String catchCatAndMouse(int x, int y, int z) {
	        int xDistance=Math.abs(x-z);
	        int yDistance=Math.abs(y-z);
	   
	        return xDistance<yDistance ? "Cat A" : xDistance>yDistance ? "Cat B" : "Mouse C";
	    }
}
