import java.io.*;

class Point{
	private int x;
	private int y;
	
public	Point(int x, int y){
	this.x=x;
	this.y=y;
	}

	public int getX(int x){
		return x;
	}
	
	public int getY(int y){
		return y;
	}
	
	public void move(int x, int y){
		this.x=x;
		this.y=y;
	}	
}

class ColorPoint extends Point{
	private String color;
	private int x;
	private int y;
	
	public ColorPoint(){
		super(0,0);
		this.color="WHITE";
	}
	public ColorPoint(int x, int y,String color){
		super(x,y);
		this.x=x;
		this.y=y;
		this.color=color;
	}
	
	public void setXY(int x, int y){
		this.x=x;
		this.y=y;
	}
	
	public void setColor(String color){
		this.color=color;
	}
	
	
	public String toString(){
		return color+"색의 ("+x+","+y+")의 점";
	}
}

class Main {
	public static void main(String[] args) throws Exception {
	  ColorPoint a=new ColorPoint();
		System.out.println(a.toString());
		
		ColorPoint b=new ColorPoint(8,8,"WHITE");
		System.out.println(b.toString());
		
		b.setXY(31,31);		
		b.setColor("MAGENTA");
		System.out.println(b.toString());
	}
}
//branch 생성 
