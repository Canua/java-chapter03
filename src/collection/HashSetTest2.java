package collection;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest2 {

	public static void main(String[] args) {
		Set<Money> s = new HashSet<Money>();
		s.add(new Money(1));
		s.add(new Money(2));
		s.add(new Money(3));
		s.add(new Money(1));
		
		// hashCode가 다르면 다르다고 판단한다.
		// equlas와 hashCode를 같이 오버라이딩 해줘야 명확한 set의 기능을 사용할 수 있다.
		for (Money m : s) {
			System.out.println(m);
		}
	}

}
