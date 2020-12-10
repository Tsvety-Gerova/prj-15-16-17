package zadacha2;


public class MyInteger {

   private int value;
	
   
   public int getValue() {
		return value;
	}

	public MyInteger(int value) {
		this.value = value;
	}
	
	
	
    public boolean isOdd() {
		//return this.value % 2 != 0;
    	return MyInteger.isOdd(this.value);
	}

	public boolean isEven() {
    	return MyInteger.isOdd(this.value);
	}
	
	public boolean isPrime () {
		return MyInteger.isPrime(this.value);
	}
	
	 
	
	
	
	public static boolean isOdd(int value) {
			return value % 2 != 0;
		}

		public static boolean isEven(int value) {
			return ! MyInteger.isOdd(value);
		}
		
		public static boolean isPrime (int value) {
			boolean isPrime = false;
			int maxDivider = (int)Math.sqrt(value);
			  for (int i = 2; i <= maxDivider; i++ ){
			    if(value % i == 0){
			        return false;		   
			      }		      
			  	}
			return true;
		}
		
		
		
		
		
		
		public static boolean isOdd(MyInteger value) {
				//return value.getValue() % 2 != 0;
			 return MyInteger.isOdd(value.getValue());
			 }

			public static boolean isEven(MyInteger value) {
				//return ! MyInteger.isOdd(value);
				return MyInteger.isEven(value.getValue());
			}
			
			public static boolean isPrime (MyInteger value) {
//				boolean isPrime = false;
//				int maxDivider = (int)Math.sqrt(value.getValue());
//				  for (int i = 2; i <= maxDivider; i++ ){
//				    if(value.getValue() % i == 0){
//				        return false;		   
//				      }		      
//				  	}
//				return true;
				
				return MyInteger.isPrime(value.getValue());
			}
			
			
			static int parseInt (char[] array) {
				return MyInteger.parseInt(new String(array));
			}
			
			static int parseInt (String array) {
				return Integer.parseInt(array);
			}
	
			
			public boolean equals (int value) {
				return this.value == value;
			}
			
			public boolean equals (MyInteger value) {
				return this.value == value.getValue();
			}
			
			
}