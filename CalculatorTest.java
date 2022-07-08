package example;

import java.util.Scanner;

import example.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		
		Calculator test = new Calculator();
		Scanner in = new Scanner(System.in);
		
		System.out.println("연산하고자 하는 두 정수값과 연산자를 입력하세요.");
		int int1 = in.nextInt();
		String str = in.next();
		int int2 = in.nextInt();
		//int result = 0;
		//float result2 = 0;
			
		if (str.equals("+")) {
			System.out.println("연산결과는 "+test.getAdd(int1, int2)+"입니다.");
		}
		if (str.equals("-")) {
			System.out.println("연산결과는 "+test.getSub(int1, int2)+"입니다.");
		}
		if (str.equals("*")) {
			System.out.println("연산결과는 "+test.getMul(int1, int2)+"입니다.");
		}
		if (str.equals("/")) {
			System.out.println("연산결과는 "+test.getDiv(int1, int2)+"입니다.");
		}
		
		
		/*
		int1 = in.nextInt();
		str = in.next();
		int2 = in.nextInt();
		
		switch (str) {
		case "+":
			result = test.getAdd(int1, int2);
			break;
		case "-":
			result = test.getSub(int1, int2);
			break;
		case "*":
			result = test.getMul(int1, int2);
			break;
		case "/":
			result2 = test.getDiv(int1, int2);
			System.out.println("연산 결과는 "+result2+"입니다.");
			break;
		default:
			System.out.println("잘못 입력 하셨습니다.");
			break;
		}
		
		System.out.println("연산 결과는 "+result+"입니다.");
		*/
	}
}
