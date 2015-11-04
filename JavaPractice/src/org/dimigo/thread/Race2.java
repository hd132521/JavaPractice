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
public class Race2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread runner1 = new Thread(new Runner("홍길동"));
		Thread runner2 = new Thread(new Runner("홍길순"));
		
		runner1.setPriority(Thread.MAX_PRIORITY);
		runner2.setPriority(Thread.MIN_PRIORITY);
		
		runner1.start();
		runner2.start();
	}

}
