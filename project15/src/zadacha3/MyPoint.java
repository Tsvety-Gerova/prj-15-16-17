package zadacha3;

public class MyPoint {

	private double x;
	private double y;
	
	public void setX(double x) {
		this.x = x;
	}
	public void setY(double y) {
		this.y = y;
	}

	
	public double getX () {
		return x;
	}
	public double getY () {
		return y;
	}
	
	
	public MyPoint () { 
		x = 0;
		y = 0;
	}
	
	public MyPoint (double x, double y) {
//	    this.x = x;
//	    this.y = y;
		setX(x);
		setY(y);
	}
	
	
	public double distance (MyPoint point) {
		//return Math.sqrt(Math.pow((point.x - x), 2) - (Math.pow((point.y - y), 2)));
          return this.distance(point.getX(), point.getY());
	}
	
	public double distance(double x, double y) {
		return Math.sqrt(Math.pow((this.x - x), 2) - (Math.pow((this.y - y), 2)));
	}
	
	public static double distance (MyPoint p1, MyPoint p2) {
		//return Math.sqrt(Math.pow((p2.x - p1.x), 2) - (Math.pow((p2.y - p1.y), 2)));
	   return p1.distance(p2.x , p2.y);
	}
	
	
}
