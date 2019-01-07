package chapter03;

public class ObjectTest02 {
	public static void main(String[] args) {
		Point p1 = new Point(10, 20);
		Point p2 = new Point(10, 20);
		Point p3 = p2;

		// == -> 두 객체의 동일성 비교
		System.out.println(p1 == p2); // 변수의 내용을 비교
		System.out.println(p1 == p3); // -> false
		System.out.println(p2 == p3); // -> true

		// equals() -> 두 객체의 동질성 비교 ( 내용 비교 )
		// Object의 equals() 기본 구현은 == 연산 결과와 같다.
		System.out.println(p1.equals(p2)); // -> false
											// p1과 p2의 내용이 같지만 false가 나온 이유는
		System.out.println(p2.equals(p3)); // -> true
		// equals()는 hashcode()와 함께 오버라이딩하게 권장하고 있다.

		// String
		String s1 = new String("ABC");
		String s2 = new String("ABC");
		System.out.println(s1 == s2); // -> false
		System.out.println(s1.equals(s2)); // -> true
		System.out.println(s1.hashCode() + ":" + s2.hashCode()); // 내용 기반으로 오버라이딩이 제공된 값
		System.out.println(System.identityHashCode(s1) + ":" + System.identityHashCode(s2)); // 기존의 주소 기반의 hashing 값을 불러
																								// 온다.

		// hashcode()와 equals()는 같이 오버라이딩을 해야 한다.
		// 오버라이딩 순서 hashcode(), equals()

		System.out.println("====================================");
		// String 리터럴 형식
		String s3 = "ABC";
		String s4 = "ABC";
		System.out.println(s3 == s4); // -> true, reference 동일
		System.out.println(s3.equals(s4)); // -> true
		System.out.println(s3.hashCode() + ":" + s4.hashCode());
		System.out.println(System.identityHashCode(s3) + ":" + System.identityHashCode(s4));
		// 주소 기반의 hash값은 동일하게 나온다
		
	}
}
