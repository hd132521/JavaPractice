/**
 * 
 */
package org.dimigo.inheritance;

/**
 *<pre>
 *org.dimigo.inheritance
 * |_SmartPhoneTest
 *1. 개요:
 *2. 작성일: 2015. 8. 25.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone myPhone = new IPhone("iPhone6", "애플", 700000);
		SmartPhone yourPhone = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(myPhone.toString());
		myPhone.turnOn();
		myPhone.pay();
		myPhone.useSpecialFunction(myPhone);
		myPhone.turnOff();
		
		System.out.println();
		
		System.out.println(yourPhone.toString());
		yourPhone.turnOn();
		yourPhone.pay();
		yourPhone.useSpecialFunction(yourPhone);
		yourPhone.turnOff();
	}

}
