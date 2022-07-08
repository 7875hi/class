package example;

public class Calculator2 {
	
	double result=0;
	
	double cal(int num1, String op, int num2){
		if(op.equals("+")) {
			result=num1+num2;
		}else if(op.equals("-")) {
			result=num1-num2;
		}else if(op.equals("*")) {
			result=num1*num2;
		}else if(op.equals("/")) {
			result=num1/num2;
		}else {
			System.out.println("+, -, *, / 중 하나만 입력하세요.");
		}
		return result;
	}
	double cal(double num1, String op, int num2){
		if(op.equals("+")) {
			result=num1+num2;
		}else if(op.equals("-")) {
			result=num1-num2;
		}else if(op.equals("*")) {
			result=num1*num2;
		}else if(op.equals("/")) {
			result=num1/num2;
		}else {
			System.out.println("+, -, *, / 중 하나만 입력하세요.");
		}
		return result;
	}
	double cal(int num1, String op, double num2){
		if(op.equals("+")) {
			result=num1+num2;
		}else if(op.equals("-")) {
			result=num1-num2;
		}else if(op.equals("*")) {
			result=num1*num2;
		}else if(op.equals("/")) {
			result=num1/num2;
		}else {
			System.out.println("+, -, *, / 중 하나만 입력하세요.");
		}
		return result;
	}
	double cal(double num1, String op, double num2){
		if(op.equals("+")) {
			result=num1+num2;
		}else if(op.equals("-")) {
			result=num1-num2;
		}else if(op.equals("*")) {
			result=num1*num2;
		}else if(op.equals("/")) {
			result=num1/num2;
		}else {
			System.out.println("+, -, *, / 중 하나만 입력하세요.");
		}
		return result;
	}

}
