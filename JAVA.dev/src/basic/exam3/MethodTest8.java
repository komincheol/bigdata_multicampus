package basic.exam3;

public class MethodTest8 {
	public static void main(String[] args) {
		int a= 10;
		testFunction(a);
		System.out.println(a);
	}

	private static void testFunction(int a) {
		// TODO Auto-generated method stub
		a++;
		System.out.println("testFunction:" + a);
	}

}
