/**
 * 
 */
package org.dimigo.exception;

/**
 *<pre>
 *org.dimigo.exception
 * |_AgeCheckException
 *1. 개요:
 *2. 작성일: 2015. 9. 21.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
@SuppressWarnings("serial")
public class AgeCheckException extends Exception{
	public AgeCheckException() {
		super();
	}

	public AgeCheckException(Movie movie) {
		super(movie.getTitle() + "은/는" + movie.getLimitAge() + "세 이상 관람가 입니다");
	}
}
