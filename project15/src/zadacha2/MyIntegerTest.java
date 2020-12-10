package zadacha2;

public class MyIntegerTest {

	public static void main(String[] args) {
        
		MyInteger f = new MyInteger(41);
		MyInteger i = new MyInteger(34);
		
		System.out.println(i.getValue());
		System.out.println(i.isEven());
		
		System.out.println(f.getValue());
		System.out.println(f.isPrime());
		
		System.out.println(i.equals(34));

		

		
	}

}
