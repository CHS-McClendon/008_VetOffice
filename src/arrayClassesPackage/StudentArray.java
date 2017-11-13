package arrayClassesPackage;

public class StudentArray {
	
	Student[] myStudents = new Student[3];

	public void buildArray() {
		
		myStudents[0] = new Student();
		myStudents[0].setFname("Tyler");
		myStudents[0].setLname("Smith");
		myStudents[0].setYearInSchool(11);
		
		myStudents[1] = new Student();
		
		myStudents[2] = new Student();
		
	}

	public void showArray() {
		
		for (int s = 0; s < myStudents.length; s++) {
			System.out.println("First Name: " + myStudents[s].getFname());
			System.out.println("Last Name: " + myStudents[s].getLname());
			System.out.println("Yr in School: " + myStudents[s].getYearInSchool());
			System.out.println("");
		}
		
		
		
		
	}

	

}
