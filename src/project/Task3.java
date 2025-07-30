package project;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//The total number of students in a class are 90 out of which 45 are boys.
		//If 50% of the total students secured grade 'A' out of which 20 are boys, 
		//then write a program to calculate the total number of girls getting grade 'A'.
		int total=90;
		
		int GradeAStudents=total/2;
		int GradeABoys=20;
		int GradeAGirls=GradeAStudents-GradeABoys;
		System.out.println("Total Number of girls getting Grade A are : "+GradeAGirls);
				

	}

}

/* output
Total Number of girls getting Grade A are : 25*/
