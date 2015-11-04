/**
 * 
 */
package org.dimigo.thread;

/**
 *<pre>
 *org.dimigo.thread
 * |_Race
 *1. 개요:
 *2. 작성일: 2015. 11. 4.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner runner1 = new Runner("홍길동");
		Runner runner2 = new Runner("홍길순");
		
		runner1.start();
		runner2.start();
	}

}
