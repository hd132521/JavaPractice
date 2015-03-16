package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String 이름 = "아이유";
		boolean 여자냐 = true;
		int 나이 = 23;
		double 키 = 161.8;
		float 몸무게 = 44.3f;
		char 혈액형 = 'A';
		System.out.println("<< 아이유 프로필 >>");
		System.out.println("이름 : " + 이름);
		System.out.print("성별 : ");
		if(여자냐) System.out.println("여자");
		else System.out.println("남자");
		System.out.println("나이 : " + 나이 + "세");
		System.out.println("키 : " + 키 + "cm");
		System.out.println("몸무게 : " + 몸무게 + "kg");
		System.out.println("혈액형 : " + 혈액형 + "형");
	}

}
