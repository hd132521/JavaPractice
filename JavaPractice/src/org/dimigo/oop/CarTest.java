/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 * |_CarTest1
 *1. 개요:
 *2. 작성일: 2015. 4. 13.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class CarTest {
	
	public static void main(String[] args) {
	/*Car2 hd = new Car2("현대자동차", "제네시스", "검정색", 255, 50000000);
	Car2 kia = new Car2("기아자동차", "K7", "흰색", 246, 40000000);
	Car2 samsung = new Car2("삼성자동차", "SM7", "회색", 200, 38000000);
	*/
	Car3 hd = new Car3("현대자동차", "제네시스", "검정색", 255, 50000000);
	Car3 kia = new Car3("기아자동차", "K7", "흰색", 246);
	Car3 samsung = new Car3("삼성자동차", "SM7", "회색");
	
	/*hd.setCompany("현대자동차");
	hd.setModel("제네시스");
	hd.setColor("검정색");
	hd.setMaxSpeed(225);
	hd.setPrice(50000000);*/
	
	System.out.println("<<자동차 목록>>");
	System.out.println("제조사명 : " + hd.getCompany());
	System.out.println("모델명 : " + hd.getModel());
	System.out.println("색상 : " + hd.getColor());
	System.out.println("최대속도 : " + hd.getMaxSpeed() + "km");
	System.out.println("가격 : " + String.format("%,d", hd.getPrice()) + "원");
	System.out.println();
	
	/*kia.setCompany("기아자동차");
	kia.setModel("K7");
	kia.setColor("흰색");
	kia.setMaxSpeed(246);
	kia.setPrice(40000000);*/
	
	System.out.println("제조사명 : " + kia.getCompany());
	System.out.println("모델명 : " + kia.getModel());
	System.out.println("색상 : " + kia.getColor());
	System.out.println("최대속도 : " + kia.getMaxSpeed() + "km");
	System.out.println("가격 : " + String.format("%,d", kia.getPrice()) + "원");
	System.out.println();
	
	/*samsung.setCompany("현대자동차");
	samsung.setModel("제네시스");
	samsung.setColor("검정색");
	samsung.setMaxSpeed(225);
	samsung.setPrice(50000000);*/
	
	System.out.println("제조사명 : " + samsung.getCompany());
	System.out.println("모델명 : " + samsung.getModel());
	System.out.println("색상 : " + samsung.getColor());
	System.out.println("최대속도 : " + samsung.getMaxSpeed() + "km");
	System.out.println("가격 : " + String.format("%,d", samsung.getPrice()) + "원");
	}
}
