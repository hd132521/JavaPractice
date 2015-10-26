/**
 * 
 */
package org.dimigo.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *<pre>
 *org.dimigo.io
 * |_SaveImgaeFromUrl
 *1. 개요:
 *2. 작성일: 2015. 10. 26.
 *</pre>
 * @author : 박유택
 * @version : 1.0
 */
public class SaveImgaeFromUrl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String imageUrl = "http://cdn.redmondpie.com/wp-content/uploads/2013/05/Xbox-One-logo.png";
		try {
			URL url = new URL(imageUrl);
			
			try(InputStream is = url.openStream();
					OutputStream os = new FileOutputStream("files/logo.png")) {
				
				int result;
				byte buf[] = new byte[100];
				
				while((result = is.read(buf)) != -1){
					os.write(buf, 0, result);
				}
				
				System.out.println("파일 저장 완료!!!");
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
