package example;

import java.util.Scanner;

public class SolutionTest {

	public static void main(String[] args) {
		
		Solution test = new Solution();
		Scanner in = new Scanner(System.in);
		
		System.out.println("연산하고자 하는 두 정수값을 입력하세요.");
		int int1 = in.nextInt();
		int int2 = in.nextInt();
		
		System.out.println(test.solution(int1, int2));

	}

}
