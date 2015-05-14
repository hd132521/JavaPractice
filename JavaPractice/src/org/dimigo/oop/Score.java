/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 *<pre>
 *org.dimigo.oop
 * |_Score
 *1. 개요:
 *2. 작성일: 2015. 5. 14.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어 점수 입력 => ");
		int kor = scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		int math = scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		int eng = scanner.nextInt();
		
		System.out.println(new StringBuilder("<<점수 출력>>\n")
											.append("국어 점수 : ")
											.append(kor).append("점")
											.append("\n수학 점수 : ")
											.append(math).append("점")
											.append("\n영어 점수 : ")
											.append(eng).append("점")
											.append("\n총점 : ")
											.append(math + eng + kor)
											.append("점")
											.append("\n평균 : ")
											.append(String.format("%.1f", (kor + math + eng) / 3.0))
											.append("점"));
	}

}
