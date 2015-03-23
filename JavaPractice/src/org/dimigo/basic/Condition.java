package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//고속보스 850 경차 300 그외 600
		//10당 고속버스 300원 경차그외 200원
		//<<~~ 통행료 계산>>
		//거리 : km
		//차종 :
		//통행료:
		String car = "고속 버스";
		int distance = 25;
		int pay = 0;
		switch(car){
		case "고속 버스":
			pay += 850; pay += distance/10 * 300; break;
		case "경차":
			pay += 300; pay += distance/10 * 200; break;
		case "그 외":
			pay += 600; pay += distance/10 * 200; break;
		}
		System.out.println("<<" + car + " 통행료 계산>>");
		System.out.println("거리 : " + distance + "km");
		System.out.println("차종 : " + car);
		System.out.println("통행료 : " + pay + "원");
		
	}

}
