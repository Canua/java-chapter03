package chapter03;

public class SingletonTest {
	public static void main(String[] args) {
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();

		System.out.println(obj1 == obj2);
	}
}
