package example;

import java.util.Scanner;

public class Ex1_loop_array_an {

	public static void main(String[] args) {

	// 1.  for문을 이용하여 1~100까지의 정수 중에서 3의 배수의 총합을 구하는 코드를 작성
		
		int sum = 0;
		for(int i = 1; i<101; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
		
	/* 2. while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈이
   		아래의 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
   		눈의 합이 5이면 실행을 멈추는 코드는 작성해 보자 
   		   
   		   출력

   		(6,4)
   		(3,6)
   		(6,2)
   		(3,2) */
		
		// 0~0.9999999999999 : 임의의 값
		// Math.random() * 6;  =  0~5.44444444444444 : 임의의 값
		// (int)(Math.random() * 6)  =  0~5 : 임의의 값
		//  =>  5.44444444444444 가 double 타입이기 때문에 int로 형변환 해줘야 함
		// (int)(Math.random() * 6) + 1 = 1~6 : 임의의 값
		// ex) 본인인증 -> 랜덤 숫자, 문자 입력하기
		
		
		int ran1 = 0;
		int ran2 = 0;		
		
		while(ran1+ran2 != 5) {
				ran1 = (int)(Math.random()*6)+1;
				ran2 = (int)(Math.random()*6)+1;
				System.out.println("("+ran1+","+ran2+")");
		}
		
		
	/* 3. 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
   		변수 money의 금액을 각각 지폐와 동전이 몇 개가 필요한지 계산해서 출력하라.
   		(단, 가능한 한 적은 수의 지폐와 동전으로으로 거슬러 주어야 한다.)
   		
   		    출력
   		금액  37210
   		만원권  3장
   		오천원권  1장
   		천원권  2장
   		오백원권  0개
   		백원권  2개
   		십원권  1개 */	
		
		int[] coin = {10000, 5000, 1000, 500, 100, 10};  //가능한 한 적은 수
		int money = 37210;
		
		System.out.println("금액: "+money);
		
		for(int i = 0; i < coin.length; i++) {
			System.out.println(coin[i]+"원권: "+money/coin[i]+"개");
			money=money%coin[i];  //coinUnit[i]로 지불하고 남은 금액
		}
		
		
	/* 4. 약수를 모두 찾는 수학 문제를 풀다가 지친 X는 컴퓨터의 도움을 받아 문제를 풀어 보기로 하였다.
		
		입력
   		24
   		
		출력
   		{ 1, 2, 3, 4, 6, 8, 12, 24}
   		약수의 개수는 8개 입니다.

   		입력
   		36

   		출력
   		{ 1, 2, 3, 4, 6, 9, 12, 18, 36 }
   		약수의 개수는 9개 입니다. */
	
		Scanner in = new Scanner(System.in);
		/*
		System.out.println("약수를 구하고자 하는 숫자를 입력하세요.");
		
		int num = in.nextInt();
		int cnt = 0;
		System.out.print("{");
		for(int i = 1; i<=num; i++) {
			if(num%i==0) {  //약수 구하기
				// num(24)와 i(24)와 같으면
				if(num==i) {
					System.out.print(i+"");
				}
				else {   // 그렇지 않으면
					System.out.print(i+", ");
				}
				cnt++;
			}
		}
		System.out.println("}");
		System.out.println("약수의 개수는 "+cnt+"개 입니다.");
		*/
		
	/* 5. 홀수와 짝수의 개수를 구하는 프로그램을 만들어라.
	 * 	
		[3, 4, 5, 6, 7]
   		= 홀수 3개, 짝수 2개
   		[12, 16, 22, 24, 29]
   		= 홀수 1개, 짝수 4개 
   		[41, 43, 45, 47, 49]
   		= 홀수 5개, 짝수 0개  */

		int[] numarr = {3, 4, 5, 6, 7};
		int evencnt = 0;   // 짝수 갯수 저장
		int oddcnt = 0;    // 홀수 갯수 저장
		
		for(int i=0; i<numarr.length; i++) {
			if(numarr[i]%2==0) {  //짝수
				evencnt++;
			}
			else {   //홀수
				oddcnt++;
			}
		}
		System.out.println("홀수 "+oddcnt+"개, 짝수"+evencnt+"개");
		
		
	/* 6. 컴퓨터가 생각한 숫자 맞추기

     	조건     
     	1과 100사이의 값을 반복적으로 입력해서 컴퓨터가 생각한 값(임의의 값)을 맞추면 게임이 끝남
     	사용자가 값을 입력하면 컴퓨터는 자신이 생각한 값과 비교해서 결과를 알려준다.
     	사용자가 컴퓨터가 생각한 숫자를 맞추면 게임이 끝나고 몇 번 만에 숫자를 맞췄는지 알려준다. */	
		
		// 컴퓨터가 생각한 값(임의의 값)
		int com = (int)(Math.random()*100)+1;
		
		int user=0;   // 사용자가 값 입력
		int count = 0;   // 시도횟수
		
		while(true) {
			count++;
			System.out.println("1과 100 사이의 값을 입력하세요.");
			user=in.nextInt();
			
			if(user>com) {
				System.out.println("더 작은 수를 입력하세요.");
			}
			else if(user<com){
				System.out.println("더 큰 수를 입력하세요.");
			}
			else if(user==com) {
				System.out.println("맞췄습니다.");
				System.out.println("시도 횟수는 "+count+"번입니다.");
				break;
			}
		}

	}

}
