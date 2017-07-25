package tr.org.kamp.linux.student;

public class Student {
	private String name;
	private double average;

	public Student(String name, double average) {
		this.name = name;
		if (average >= 0.0) {
			if (average <= 100) {

				this.average = average;
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverage() {
		return average;

	}

	public void setAverage(double average) {

		if (average >= 0.0) {
			if (average <= 100) {

				this.average = average;
			}
		}

	}

	public String getLetterGrade() {

		String LetterGrade;

		if (average >= 90.0) {

			LetterGrade = "A";

		} else if (average >= 80.0) {

			LetterGrade = "B";

		}

		else if (average >= 70.0) {

			LetterGrade = "C";

		}

		else if (average >= 60.0) {

			LetterGrade = "D";

		}
		else {LetterGrade="F";}

		return LetterGrade;
	}

}
