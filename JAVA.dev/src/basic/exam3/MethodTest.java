package basic.exam3;

public class MethodTest {
public static void main(String[] args) {
	int [] n={1,23,10,70,80,60,25};
	int min=minNumber(n);
	int max=maxNumber(n);

	System.out.println("배열n에서 가장 작은값은:"+min);
	System.out.println("배열n에서 가장큰값은:"+max);
	
}

private static int minNumber(int[] n) {
	int min=n[0];
	for(int i=1 ; i< n.length ; i++){ 
		if(n[i] < min){ 
			min = n[i]; 
			}
	}
	return min;
}

private static int maxNumber(int[] n) {
	int max=n[0];
	for(int i=1 ; i< n.length ; i++){ 
		if(n[i] >= max){ 
			max = n[i]; 
			}
	}
	return max;
}
}
