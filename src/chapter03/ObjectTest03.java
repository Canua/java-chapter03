package chapter03;

public class ObjectTest03 {
	public static void main(String[] args) {
		Rect r1 = new Rect(10, 20);
		System.out.println(r1);

		Rect r2 = new Rect(20, 10);
		System.out.println(r2.equals(r1));

		Rect r3 = new Rect(50, 5);
		System.out.println(r3.equals(r1));

		// String equals 좋은 코드
		 String s = "Hello";
//		String s = null; // Exception 발생
		System.out.println(equalHello(s));
	}

	public static boolean equalHello(String s) {
//		String h = "Hello";
//		return h.equals(s);
		return "Hello".equals(s); // 좋은 equals
	}
}
