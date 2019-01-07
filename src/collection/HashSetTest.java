package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// HashSet
		Set<String> s = new HashSet<String>();

		// 요소 추가
		String s1 = new String("고길동");
		String s2 = new String("고길동");

		s.add("둘리");
		s.add("마이콜");
		s.add(s1);
		// 동일성으로 찾는 것이 아니라 동질성으로 찾는다.
		// ( 같은 객체를 찾는 것이 아니라 contains로 물었을 떄는 값(내용)이 같은지 검사한다)
		System.out.println(s.contains(s2));
		System.out.println(s.size());

		String s3 = new String("고길동");
		s.remove(s3);
		
		// 순회
		for(String str : s) {
			System.out.println(str);
		}

	}

}
