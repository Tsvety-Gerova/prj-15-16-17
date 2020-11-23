package zadacha2;


public class MyInteger {

   public static int value = 41;
	 
	MyInteger() {}
	
	public int getValue() {
		return value;
	}
	
	public boolean isEven(int value) {
		this.value = value; 
		boolean isEven = false;
		if(value/2 == 0) {
			isEven = true;
		}
		return isEven;
	}
	
	public boolean isOdd(int value) {
		this.value = value; 
		boolean isOdd = false;
		if(value/2 != 0) {
			isOdd = true;
		}
		return isOdd;
	}
	
	public boolean isPrime (int value) {
		this.value = value;
		boolean isPrime = false;
		int maxDivider = (int)Math.sqrt(value);
		  for (int i = 2; i <= maxDivider; i++ ){
		    if( value % i == 0){
		       isPrime = false;		   
		      }		      
		  	}
		return isPrime;
	}
	
	public boolean equals(int value) {
		boolean equals = false;
		if (MyInteger.value == value) {
			equals = true;
		}
		return equals;
	}
	
	
	public static int parseInt(char[] numArr) {
		String arr = new String(numArr);
		int number = Integer.parseInt(arr);
		return number;
		
	}
 
	public static int parseInt(String numArr) {
		int i = Integer.parseInt(numArr);
        return i;
	}	
	
}
