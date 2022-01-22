package javaInterview;

public class UsingArrayObje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Students s1 = new Students(10, "Anish", true);
		Students s2 = new Students(18, "Singh", true);
		Students s3 = new Students(10, "Pradip", false);
		
		Students []allStudents = new Students[3];
		
		allStudents[0]=s1;
		allStudents[1]=s2;
		allStudents[2]=s3;
		
		System.out.println(allStudents[1].name);
		
		
	}

}
