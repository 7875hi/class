package example;

import java.util.Arrays;
import java.util.Scanner;

public class Ex1_loop_array {

	public static void main(String[] args) {
		
	// 1. for문을 이용하여 1~100까지의 정수 중에서 3의 배수의 총합을 구해라
		int sum = 0;
		for(int i=1; i<101; i++) {
			if(i%3==0) {
				sum+=i;
			}
		}
		System.out.println(sum);
		
	// 2. while문과 Math.random()메소드를 이용해서 두 개의 주사위를 던졌을 때 나오는 눈이
	//   아래의 형태로 출력하고, 눈의 합이 5가 아니면 계속 주사위를 던지고,
	//   눈의 합이 5이면 실행을 멈추는 코드는 작성해 보자
		/* 출력
   		(6,4)
   		(3,6)
   		(6,2)
   		(3,2)
   		*/
 
		int ran1 = 0;
		int ran2 = 0;		
		
		while(true) {
			if((ran1+ran2) != 5) {
				ran1 = (int)(Math.random()*6)+1;
				ran2 = (int)(Math.random()*6)+1;
				System.out.println("("+ran1+","+ran2+")");
			}
			else {
				System.out.println(ran1+ran2+": 실행종료");
				break;
			}
		}
		
		
	// 3. 거스름돈을 몇 개의 동전으로 지불할 수 있는지를 계산하는 문제이다.
	//   변수 money의 금액을 각각 지폐와 동전이 몇 개가 필요한지 계산해서 출력하라.
	//   (단, 가능한 한 적은 수의 지폐와 동전으로으로 거슬러 주어야 한다.)
		
		Scanner in = new Scanner(System.in);
	/*	int[] coin = {10000, 5000, 1000, 500, 100, 10};  //가능한 한 적은 수
		int money = in.nextInt();
		
		System.out.println("금액: "+money);
		
		for(int i = 0; i < coin.length; i++) {
			if(coin[i] == 10000) {
				System.out.println("만원권: "+money/coin[i]+"장");  //지불할 동전의 개수
			}
			else if(coin[i] == 5000) {
				System.out.println("오천원권: "+money/coin[i]+"장");
			}
			else if(coin[i] == 1000) {
				System.out.println("천원권: "+money/coin[i]+"장");
			}
			else if(coin[i] == 500) {
				System.out.println("오백원권: "+money/coin[i]+"개");
			}
			else if(coin[i] == 100) {
				System.out.println("백원권: "+money/coin[i]+"개");
			}
			else {
				System.out.println("십원권: "+money/coin[i]+"개");
			}
			//System.out.println(coin[i]+"원권: "+money/coin[i]+"개");
			money=money%coin[i];  //coinUnit[i]로 지불하고 남은 금액
		}
		*/

		// 4. 약수를 모두 찾는 수학 문제를 풀다가 지친 X는 컴퓨터의 도움을 받아 문제를 풀어 보기로 하였다.
		/*
		System.out.println("약수를 구할 숫자를 입력하세요.");
		int Yaksu = in.nextInt(); 
		int i=0;
		int count=0;
		
		for(i=1; i<=Yaksu; i++) {
			if(Yaksu%i == 0) {
				System.out.print(i + " ");
				count++;
			}
		}System.out.print("\n약수의 개수는 "+count+"개 입니다.");
		*/
		
		// 5. 홀수와 짝수의 개수를 구하는 프로그램을 만들어라.
		
		int[] Quantity = {3, 4, 5, 6, 7};
		int count2=0;
		int count3=0;
		
		for(int a=0; a< Quantity.length; a++) {
			if(Quantity[a]%2==0) {
				count2++;
				
			}
			else {
				count3++;
			}
			
		}System.out.print("홀수: "+count3+", 짝수: " + count2 +"개");
	}

}
