package example;
/*
import java.util.InputMismatchException;
import java.util.Scanner;
*/
import java.util.*;  // java.util 안에 있는걸 다 쓰겠다 ->java.util 이 똑같기 때문에 가능

// 컴퓨터가 생각하는 숫자(1~100)를 맞추는 게임 프로그램을 작성해보자.
public class Exception {

	public static void main(String[] args) {
		//Scanner in = new Scanner(System.in);
		
		int com = (int)(Math.random()*100)+1;
		
		int me = 0;
		int count = 0;
		
		while(true) {
			//System.out.println("컴퓨터가 생각하는 숫자 : "+com);
			System.out.println("1 과 100 사이의 값을 입력하세요 : ");
			count++;
			
			try {
			Scanner in = new Scanner(System.in);
			me = in.nextInt();
			}catch(InputMismatchException ime) {
					System.out.println("숫자만 입력할 수 있습니다. 다시 입력해주세요~");
					continue;	
			}//finally {	
				
			if(me>com) {
				System.out.println("더 작은 수를 입력하세요.");

			}
			else if(me<com) {
				System.out.println("더 큰 수를 입력하세요.");

			}
			else if(me==com) {
				System.out.println("정답");
				System.out.println(count+"번 만에 맞추셨습니다.");
				break;
			}
			//}
		}

	}

}
