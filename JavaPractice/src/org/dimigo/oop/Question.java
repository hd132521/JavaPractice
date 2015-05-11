/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *<pre>
 *org.dimigo.oop
 * |_Question
 *1. 개요:
 *2. 작성일: 2015. 5. 11.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("이빨에 초밥이 끼면?");
		if(scanner.nextLine().equals("esc"))
			System.out.println("정답입니다!!");
		else
			System.out.println("틀렸습니다 ㅠ.ㅠ");
		
		System.out.println("가장 좋아하는 밴드는?");
		if(scanner.nextLine().equals("메가데쓰"))
			System.out.println("정답입니다!!");
		else
			System.out.println("틀렸습니다 ㅜ.ㅜ");
		
		System.out.println("가장 좋아하는 바나나는?");
		if(scanner.nextLine().equals("바나바나나"))
			System.out.println("바나나입니다!");
		else
			System.out.println("바나나가 아닙니다!");
		
		System.out.println("가장 좋아하는 사슴은?");
		if(scanner.nextLine().contains("사슴"))
			System.out.println("사슴입니다!");
		else
			System.out.println("사슴이 아닙니다!");
		

		scanner.close();
		}
		
	}
