package org.college;

public class Hostel extends Student
{
private void hostel() {
	System.out.println("Hostel : Saro");

}

public static void main(String[] args) {
	Hostel y =new Hostel();
	y.studentDept();
	y.collegeCode();
	y.collegeName();
	y.collegeRank();
	y.hostel();
	y.studentDept();
}
}
