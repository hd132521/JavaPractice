package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int clerk = 3;
		int store = 1500;
		long money = 1700000l;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여:" + String.format("%,d", money) + "원");
		System.out.println("점포 내 직원 수:" + clerk + "명");
		System.out.println("점포 수 :" + String.format("%,d", store) + "개");
		
		long total = money * 12 * clerk * store;
		
		System.out.println("연간 인건비:" + String.format("%,d", total) + "원");

	}

}
