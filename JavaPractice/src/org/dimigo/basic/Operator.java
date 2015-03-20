package org.dimigo.basic;

public class Operator {
	public static void main(String[] args) {
		int ladderA = 9;
		int ladderB = 10;
		double ladderH = 5.8;
		
		double ladderS = (ladderA + ladderB) * ladderH / 2;
		
		int parallelLength = 9;
		double parallelHeight = 5.4;
		
		double parallelS = parallelLength * parallelHeight;
		
		if(ladderS>parallelS)
				System.out.println("사다리꼴이 평행사변형 보다 "+ (ladderS-parallelS) + " 더 큽니다");
		else if(parallelS>ladderS)
			System.out.printf("평행사변형이 사다리꼴  보다 "+ -(ladderS-parallelS) + " 더 큽니다");
		else
			System.out.println("넓이가 같습니다");
	}
}
