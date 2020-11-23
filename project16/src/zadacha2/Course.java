package zadacha2;

public class Course {

	private String courseName;
	private String[] students;
	private int numberOfStudents = 0;
	 
	public Course(String string) {
		
	}

	public void course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public void addStudent(String student) {
	  numberOfStudents += 1;
    }

	public void dropStudent(String student) {
		students[0] = null;
		for (int i = 9; i >= 0; i --) {
			students[i] = students[i - 1];			
		}
		
	}

	public String[] getStudents() {
		return students; 	
	}
	
	public int getNumberOfStudents () {
		return numberOfStudents;
	}
}
