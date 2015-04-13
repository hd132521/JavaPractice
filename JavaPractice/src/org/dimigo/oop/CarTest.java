/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 * |_CarTest
 *1. 개요:
 *2. 작성일: 2015. 4. 13.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class CarTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car modern = new Car();
		Car kia = new Car();
		Car samsung = new Car();
		
		modern.setCompany("현대자동차");
		modern.setModel("제네시스");
		modern.setColor("검정색");
		modern.setMaxSpeed(225);
		modern.setPrice(50000000);
		
		System.out.println("<자동차 목록>");
		System.out.println("제조사명 : "+ modern.getCompany());
		System.out.println("모델명 : "+ modern.getModel());
		System.out.println("색상 : "+ modern.getColor());
		System.out.println("최대속도 : " + modern.getMaxSpeed() + "km");
		System.out.println("가격 : "+ String.format("%,d", modern.getPrice())+ "원");
		System.out.println();
		
		kia.setCompany("기아자동차");
		kia.setModel("K7");
		kia.setColor("흰색");
		kia.setMaxSpeed(246);
		kia.setPrice(40000000);
		
		System.out.println("제조사명 : "+ kia.getCompany());
		System.out.println("모델명 : "+ kia.getModel());
		System.out.println("색상 : "+ kia.getColor());
		System.out.println("최대속도 : " + kia.getMaxSpeed() + "km");
		System.out.println("가격 : "+ String.format("%,d", kia.getPrice())+ "원");
		System.out.println();
		
		samsung.setCompany("삼성자동차");
		samsung.setModel("SM7");
		samsung.setColor("회색");
		samsung.setMaxSpeed(200);
		samsung.setPrice(38000000);
		
		System.out.println("제조사명 : "+ samsung.getCompany());
		System.out.println("모델명 : "+ samsung.getModel());
		System.out.println("색상 : "+ samsung.getColor());
		System.out.println("최대속도 : " + samsung.getMaxSpeed() + "km");
		System.out.println("가격 : "+ String.format("%,d", samsung.getPrice())+ "원");
	}

}
