package main;

import java.util.ArrayList;

public class Quiz5 {

	public static void main(String[] args) {

		ArrayList<Student> list = new ArrayList<Student>();

		Student student1 = new Student(1001, "둘리");
		Student student2 = new Student(1002, "또치");
		Student student3 = new Student(1003, "도우너");

		list.add(student1);
		list.add(student2);
		list.add(student3);

		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());

	}

}

class Student {

	// 속성
	int studentId;
	String studentName;

	// 생성자
	public Student(int studentId, String studentName) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
	}

	// 학생 정보를 반환하는 메소드
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + "]";
	}

}