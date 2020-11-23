package zadacha3;

public class MyPointTest {

	public static void main(String[] args) {

		MyPoint point1 = new MyPoint();
		MyPoint point2 = new MyPoint(2,4);
	
		MyPoint.distance (point1, point2);
		System.out.println("the distance between point 1 and point 2 is " + MyPoint.distance(point1, point2));
	}

}
