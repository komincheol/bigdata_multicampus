package javadev_exam2;

public class Gugudan {
	public static void main(String[] args) {

		for (int a = 0; a < 2; a++) {
			for (int i = 1; i <= 9; i++) {

				for (int j = 2+(4*a); j <= 5+(4*a); j++) {
					
					System.out.print(j + "X" + i + "=" + (i * j) + '\t');

				}
 			System.out.println();

			}
			System.out.println();
		}
		
		System.out.println("----------------------------------------");
		for(int i=1,n=0; i<=9 && n<2; i++){
			for(int j = 2+(4*n); j <= 9+(4*n); j++){
				System.out.print(j+ "X" + i + "=" + (i * j) + '\t');
			}
			System.out.println("");
		if(n==9){
			n++;
			i=0;
			
			System.out.println("");
			
		}
		}
		System.out.println("----------------------------------------");
		for(int i=2; i<=9; i+=4){
			for(int j=1; j<=9; j++){
				for(int k=0;k<4;k++){
					System.out.print((i+k)+"X"+j+"= "+((i+k)*j)+'\t');
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
