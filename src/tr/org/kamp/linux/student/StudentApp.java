package tr.org.kamp.linux.student;

public class StudentApp {

	public static void main(String[] args) {
		Student st1=new Student("name",68);
		System.out.println(st1.getAverage()+st1.getLetterGrade());

	}

}
