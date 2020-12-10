package zadacha1;

public class TestTime {

	public static void main(String[] args) {
		
		
		Time t1 = new Time();
		Time t2 = new Time(555550000);
		Time t3 = new Time(5, 23, 55);
		
		t2.setTime(System.currentTimeMillis());
		System.out.println("The time of t1 is " + t1.getHours() + ":" + t1.getMinutes() + ":" + t1.getSeconds());
		System.out.println("The time of t2 is " + t2.getHours() + ":" + t2.getMinutes() + ":" + t2.getSeconds());
		System.out.println("The time of t3 is " + t3.getHours() + ":" + t3.getMinutes() + ":" + t3.getSeconds());
	}

}
