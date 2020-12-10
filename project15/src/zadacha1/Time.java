package zadacha1;

public class Time {

	 private long hours;
	 private long minutes;
	 private long seconds;
	 
	 public Time () { 
		 setTime(System.currentTimeMillis());
	 }
	  
	 public Time (long miliseconds) {
		 this.seconds = ((miliseconds / 1000) % 60);
		 this.minutes = ((miliseconds / (1000 * 60)) % 60);
		 this.hours = ((miliseconds / (1000 * 60 * 60)) % 24) + 2;
	 }
	 
	 public Time(int hours, int minutes, int seconds){
		 setHours(hours);
		 setMinutes(minutes);
		 setSeconds(seconds);
	 }
	
	 
	 public long getHours() {
		 return hours;
	 }
	 public long getMinutes() {
		 return minutes;		 
	 }
	 public long getSeconds() {
		return seconds;
	 }

	private void setHours(long hours) {
		this.hours = hours;
	}

	private void setMinutes(long minutes) {
		this.minutes = minutes;
	}

	private void setSeconds(long seconds) {
		this.seconds = seconds;
	}
	 
	public void setTime (long milliseconds) {
		long millisecondsToday = milliseconds % (1000L * 60 * 24);
		this.hours = (int)(millisecondsToday / ( 1000 * 60 * 60));
		this.minutes = (int)(millisecondsToday % ( 1000 * 60 * 60)) / ( 1000 * 60);
		this.seconds = (int)(millisecondsToday % ( 1000 * 60 * 60)) % ( 1000 * 60) / 1000;
		
	}
	 
	

}
