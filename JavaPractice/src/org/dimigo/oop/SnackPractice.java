/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 * |_SnackPractice
 *1. 개요:
 *2. 작성일: 2015. 5. 18.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class SnackPractice {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Snack[] snacks = new Snack[] {
				new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)
		};
		
		int sum = 0;
		
		for(Snack snack : snacks)
		{
			snack.printSnack();
			sum += snack.calcPrice();
		}
		
		System.out.println("총 구매 금액 : " + String.format("%,d", sum) + "원");
	}

}
