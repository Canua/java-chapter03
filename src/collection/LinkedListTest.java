package collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		// LinkedList
		List<String> list = new LinkedList<String>();

		// list 요소 추가
		list.add("둘리");
		list.add("마이콜");
		list.add("도우너");

		// 순회 1
		System.out.println("- 순회 방법 1");
		int count = list.size();
		for (int i = 0; i < count; i++) {
			String s = list.get(i);
			System.out.println(s);
		}
		// list 요소 삭제
		list.remove(1);

		// 순회 2
		System.out.println("- 순회 방법 2");
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String s = it.next();
			System.out.println(s);
		}
		// 한번 사용한 Iterator는 재사용 할 수 없다.
		while (it.hasNext()) {
			String s = it.next();
			System.out.println("-->" + s);
		}
		// 순회 3 (for~each) - 현재 많이 사용되는 방법
		System.out.println("- 순회 방법 3");
		for (String s : list) {
			System.out.println(s);
		}
	}
}
