import java.io.*;

class Point{
	private int x;
	private int y;
	
public	Point(int x, int y){
	this.x=x;
	this.y=y;
	}

	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public void move(int x, int y){
		this.x=x;
		this.y=y;
		
	}	
}

class Point3D extends Point{

	//protected int x;
	//protected int y;
	private int z;

	public Point3D(int x, int y, int z){
		super(x,y);

		this.z=z;
	}
	
	public void moveUp(){
		this.z=z+1;
	}
	
	public void moveDown(){
		this.z=z-1;
	}
	
	public void move(int x, int y, int z){
	
		move(x,y);
		this.z=z;
	}
	
	public String toString(){
		
		return "("+super.getX()+","+super.getY()+","+z+")의 점";
	}
}

class Main {
	public static void main(String[] args) throws Exception {
	 	Point3D a= new Point3D(2,0,19);
	

		System.out.println(a.toString());
		a.moveUp();
		System.out.println(a.toString());
		a.moveDown();
		System.out.println(a.toString());
		
		
		a.move(11,11);
	 
		
		System.out.println(a.toString());

		a.move(2019,10,4);
		
		System.out.println(a.toString());
	
	}
}