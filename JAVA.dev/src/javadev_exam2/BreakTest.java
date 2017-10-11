package javadev_exam2;

public class BreakTest {
	public static void main(String[] args) {
		int sum=0;
		int i=1;
//		for(int i=1;i<=10 ;i++){
//			sum+=i;
//			if(sum>= 30)break;
//			i++;
//		}
		while(true){
			sum+=i;
			if(sum>= 30)break;
			i++;
		}
		System.out.println("1부터"+i+"까지 정수의 합은"+sum+"입니다.");
	}

}
