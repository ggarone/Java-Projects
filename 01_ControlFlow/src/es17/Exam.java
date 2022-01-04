package es17;

import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		Integer writtenMark=0, practiceMark=0,mark=0;
		boolean passed = false, praise=false;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Written test mark: \n>> ");
		writtenMark = sc.nextInt();
		if(writtenMark > 8 || writtenMark < -8) {
			System.out.println("[Err] writtenMark needs to be beetween -8/+8");
			return;
		}
		
		System.out.print("Practice test mark: \n>> ");
		practiceMark = sc.nextInt();
		if(practiceMark > 24 || practiceMark < 0) {
			System.out.println("[Err] practiceMark needs to be beetween 0/24");
			return;
		}
		
		mark = writtenMark + practiceMark;
		
		if (writtenMark > 0 && mark >= 18) {
			passed = true;
		}
		if(writtenMark > 0 && mark > 30) {
			praise = true;
		}
		
		if(passed && praise) {
			System.out.println("Student has passed the exam with 30 and praise!");
		}
		else if (passed) {
			System.out.println("Student has passed the exam with " + mark);
		}
		else
			System.out.println("Student hasn't passed the exam.");
		
		
		sc.close();
	}

}
