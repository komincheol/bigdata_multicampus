package api;

public class BoxedPrimiriviesTest {
	public static void main(String[] args) {
		Integer i = new Integer(10);
		Integer i2= 10;//java 5nf, auto boxing

		int i3= i.intValue(); //java 5nf, unboxing
		
		Object i4= 10;
		int i5 = (int) i4;
		int i6 = (Integer) i4;
		int i7 = Integer.parseInt("100");
		long l1 = Long.parseLong("100L");
		
	}
}
