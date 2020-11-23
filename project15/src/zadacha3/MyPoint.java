package zadacha3;

public class MyPoint {

	private static double x;
	private static double y;
	
	public double getX () {
		return x;
	}
	public double get () {
		return y;
	}
	
	public MyPoint () { 
		x = 0;
		y = 0;
	}
	
	public MyPoint (double x, double y) {
	    this.x = x;
	    this.y = y;
	}
	
	
	public double distance (MyPoint point) {
		return Math.sqrt(Math.abs(Math.pow((point.x - this.x), 2) - (Math.pow((point.y - this.y), 2))));
	}
	public double distance(int x, int y) {
		return Math.sqrt(Math.abs(Math.pow((x - this.x), 2) - (Math.pow((y - this.y), 2))));
	}
	public static double distance (MyPoint p1, MyPoint p2) {
		return Math.sqrt(Math.abs(Math.pow((p2.x - p1.x), 2) - (Math.pow((p2.y - p1.y), 2))));
	}
	
	
}
