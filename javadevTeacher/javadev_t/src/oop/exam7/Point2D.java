package oop.exam7;

public class Point2D {
	int x;
	int y;
	
	public Point2D(){
		this(1, 1);
		System.out.println("Point2D()");
	}
	public Point2D(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point2D(x,y)");
	}
}
