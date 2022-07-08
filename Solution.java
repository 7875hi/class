package example;

public class Solution {

	// 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 
	
	int solution(int a, int b) {
		int sum=0;
		
		if(a<b) {
			for(int i=a; i<=b; i++) {
				sum+=i;
			}
		}
		else {
			for(int i=b; i<=a; i++) {
				sum+=i;
			}
		}
		return sum;
	}
	
}
