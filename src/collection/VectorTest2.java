package collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorTest2 {
	public static void main(String[] args) {
		// Vector
		Vector<String> v = new Vector<String>();

		// 요소 추가
		v.addElement("둘리");
		v.addElement("마이콜");
		v.addElement("또치");
		
		// 순회 1
		System.out.println("- 순회 1");
		int count = v.size();
		for (int i = 0; i < count; i++) {
			String s = v.elementAt(i);
			System.out.println(s);
		}

		// 요소 제거
		v.removeElementAt(1);

		// 순회 2 Enumeration을 이용한 방법
		System.out.println(" - 순회 2");
		Enumeration<String> e = v.elements();
		while (e.hasMoreElements()) {
			String s = e.nextElement();
			System.out.println(s);
		}
		
	}
}
