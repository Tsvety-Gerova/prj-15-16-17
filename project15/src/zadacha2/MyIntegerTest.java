package zadacha2;

public class MyIntegerTest {

	public static void main(String[] args) {

		MyInteger v1 = new MyInteger();
		
		v1.isEven(6);
		v1.equals(9);
		v1.isPrime(MyInteger.value);
		
		if(v1.equals(9) == true) {
			System.out.println("The numbers are equal");
		}
		if (v1.equals(9) == true) {
			System.out.println("The number is even");
		}
	}

}
