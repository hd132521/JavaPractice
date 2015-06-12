/**
 * 
 */
package org.dimigo.oop;

/**
 *<pre>
 *org.dimigo.oop
 * |_PiggyBank
 *1. 개요:
 *2. 작성일: 2015. 6. 12.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class PiggyBank {
	private static int balance;
	
	public static void putMoney(FamilyMember member, int amount){
		System.out.println(member.getMemberName() + " " + amount + "원 넣음");
		balance += amount;
	}
	
	public static void printBalance(){
		System.out.println("돼지저금통 총 금액 : " + balance + "원");
	}
}
