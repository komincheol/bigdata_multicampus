package javadev_exam2;

public class ForTest3 {
public static void main(String[] args) {
	
	
	for(int i=1;i<=5; i++){
		
		for(int j=1;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	for(int i=1;i<=5; i++){
		
		for(int j=i;j<=5;j++){
			System.out.print("*");
		}
		System.out.println();
	}
	System.out.println("-------------");
for(int i=1;i<=5; i++){
		
		for(int j=5;j>=i;j--){
			System.out.print("*");
		}
		System.out.println();
	}
for(int i=1;i<=5; i++){
	
	for(int j=1;j<=6-i;j++){
		System.out.print("*");
	}
	System.out.println();
}
for(int i=1;i<=5; i++){
	
	for(int j=1;j<=5;j++){
		if(i<=j)System.out.print("*");
		System.out.print(" ");
	}
	System.out.println();
}
}
}
