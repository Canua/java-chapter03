package chapter03;

public class StringTest03 {
	public static void main(String[] args) {
		String s = "aBcABCabcAbc";

		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s.indexOf("abc"));
		System.out.println(s.indexOf("abc", 7));
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 5));

		String s2 = "     ab cd      ";
		String s3 = "efg,hij,lmno,pq";
		String s4 = s2.concat(s3);

		System.out.println(s4);
		System.out.println("--------" + s4.trim() + "-------"); // 좌우 공백 제거
		System.out.println("--------" + s4.replaceAll(" ", "") + "-------");

		String[] tokens = s3.split(",");
		for (String str : tokens) {
			System.out.println(str);
		}

		// StringBuffer
		StringBuffer sb = new StringBuffer("");
		sb.append("Hello ");
		sb.append("World ");
		sb.append(2018);

//		String str = "Hello " + "World " + 2018; // String객체 + String객체 + int형 숫자
		String str = new StringBuffer("Hello ").append("World ").append(2018).toString();
		System.out.println(sb);

		// 주의 : '+' 연산자로 문자열을 더할 때
		String str2 = "";
		StringBuffer sb2 = new StringBuffer("");
		for (int i = 0; i < 10000000; i++) {
//			str2 = str2 + i;  // -1
//			String str2 = new StringBuffer(str2).append(i);
			sb2.append(i); // StringBuffer를 사용하는 이유 중 상단의 str2 + i 보다 메소드를 호출하는 StringBuffer의 호출은 연산 속도가
							// 빠르다. -2
							// -1, -2 비교
		}
		// 간단한 + 연산은 가독성이 좋아 쓰기 용이하지만 많은 수의 연산을 실행할 때는 외부에서 StringBuffer를 사용하여 연산하는 것이
		// 좋다.

		// foramt
		String name = "둘리";
		int score = 100;

		System.out.println(name + "님의 점수는 " + score + "점입니다.");
		String str3 = String.format("%s님의 점수는 %d점입니다.", name, score);
		System.out.println(str3);
	}
}
