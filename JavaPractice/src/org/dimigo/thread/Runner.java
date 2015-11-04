/**
 * 
 */
package org.dimigo.thread;

/**
 *<pre>
 *org.dimigo.thread
 * |_Runner
 *1. 개요:
 *2. 작성일: 2015. 11. 4.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class Runner extends Thread{
	private String name;
	
	public Runner() {
		
	}
	
	public Runner(String name) {
		this.name = name;
	}
	
	@Override
	public void run(){
		System.out.println(name + " 출발");
		for(int i = 100; i > 0; i-=10)
		{
			System.out.println(name + " " + i + " 미터");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println();
		}
		
		System.out.println(name + " 골인");
	}
}
