package basic.exam3;

public class MethodTest9 {
public static void main(String[] args) {
	int[] n = {100,200};
	
	swapFuction(n);
	System.out.println(n[0]);
	System.out.println(n[1]);
}

private static void swapFuction(int[] yb) {
	// TODO Auto-generated method stub
	int temp = yb[0];
	yb[0]=yb[1];
	yb[1]=temp;
}
}
