package example;

import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) {

		Student test = new Student();
		Scanner in = new Scanner(System.in);

		test.kor = in.nextInt();
		test.eng = in.nextInt();
		test.math = in.nextInt();
		
		System.out.println(test.getTotal());
		System.out.println(test.getAverage());

	}

}
