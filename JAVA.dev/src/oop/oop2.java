package oop;

public class oop2 extends oop{
	
private	int z;

public int getZ() {
	return z;
}

public void setZ(int z) {
	this.z = z;
}
public void print() {
	super.print();
	System.out.println("z = " + getZ());	
}


}
