package javadev_exam2;

public class ContinueTest {
public static void main(String[] args) {
	int sum=0;
	

	for(int i=1; i<=1000; i++){
		if(i%3 ==0)continue;
			sum +=i;
		}
	System.out.println(sum);
	}
}
