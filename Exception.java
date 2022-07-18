package Exception;

public class Exception {

	public static void main(String[] args) {
		/*
		// int a = "정자바";  컴파일에러: 문법적으로 틀렸을 때 나오는 에러
		int a = 10;
		int b = 0;
		
		System.out.println(a/b);  // 런타임에러: 실행했을 때 나오는 에러
		                          // 산술적예외(ArithmeticException): 10을 0으로 나눌 수 없음
		*/
		
		// try{} ~catch(){}
		int a = 0;
		int b = 0;
		
		System.out.println(1);
		System.out.println(2);
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}catch(ArithmeticException ae) {
			//System.out.println(5);
			
			if(a==0) {
				a=5;
			}
			if(b==0) {
				b=1;
			}
			System.out.println(a/b);
		}finally {
			System.out.println(4);
		}
		System.out.println(6);
		
		
/*
 예외처리
1. 예외가 발생한 경우
try -> catch -> finally

2. 예외가 발생하지 않은 경우
try -> finally
 */
		
	}

}
