package oop.exam7;

public class Point3D extends Point2D{
	
	int z;
	
	public Point3D(){
		this(100,200,300);
		System.out.println("point3D()");
	}
	public Point3D(int x, int y, int z){
		super(x,y);
		System.out.println("point3D(x,y,z)");
	}

}
