package chapter03;

public class WrapperClassTest01 {
	public static void main(String[] args) {
		// WrapperClass는 new(생성자)를 사용하지 않고 Auto Boxing으로 인해 생성된다.
		Integer i = new Integer(10); // 10이라는 객체 생성
		Character c = new Character('A');
		Boolean b = new Boolean(true);

		System.out.println(i);
		System.out.println(c);
		System.out.println(b);

		// Auto Boxing
		Integer i2 = 10;
		Integer i3 = 10;
		System.out.println(i2 == i3);

		// Auto Unboxing
//		int j = 20 + i2.intValue(); // intValue()를 해주어야 하지만 자동으로 Auto Boxing이 되기 때문에 아래의 연산식이 가능하다
		int j = 20 + i2;
		System.out.println(j);
	}
}
