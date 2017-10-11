package javadev_exam2;

public class DoWhileTest {
	public static void main(String[] args) {
//		int i=1;
//		do{
//			System.out.println("하이");
//		    i++;
//		}while(i <=3);
		int i,j;
		i=(int)(Math.random() * 6)+1;
		do {
			j = (int) (Math.random() * 6) + 1;
		} while (j == i);
		
		System.out.println("i ="+i);
		System.out.println("j ="+j);
		
	}

}
