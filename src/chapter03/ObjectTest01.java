package chapter03;

public class ObjectTest01 {

	public static void main(String[] args) {
		Point p = new Point(10, 20);

		System.out.println(p.getClass()); // reflection
		System.out.println(p.hashCode()); // reference value x (레퍼런스 변수에 저장되어 있다)
											// address x
											// address 기반의 hashing 값
											// hashing은 같은 값은 나올 수가 있으나 어떤 것을 hashing 하느냐에 따라 다르며
											// 고유의 address를 갖기 때문에 유일(고유)하다고 할 수 있다

		System.out.println(p);				// Point 객체 
		System.out.println(p.toString());   // 스트링 객체, 기본 구현 : getClass() + "@" + hashCode()
		
	}

}
