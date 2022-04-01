package aufgabe_6;

import java.awt.Point;

class NamedPoint
{
	private int cordX, cordY;
	private String name;
	
	public NamedPoint(int x, int y, String name)
	{
		this.cordX = x;
		this.cordY = y;
		this.name = name;
	}
	
	public NamedPoint(int x, int y)
	{
		this(x,y,"Punkt");
	}
	
	public int getX()
	{
		return this.cordX;
	}
	
	public int getY()
	{
		return this.cordY;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getStatus()
	{
		return "<" + this.name + ">: (" + this.cordX + "|" + this.cordY + ")"; 
	}
	
	public Point getPoint()
	{
		return new Point(this.cordX, this.cordY);
	}
	
	public void add(NamedPoint p)
	{
		this.cordX += p.getX();
		this.cordY += p.getY();
	}
	
	public void subtract(NamedPoint p)
	{
		this.cordX -= p.getX();
		this.cordY -= p.getY();
	}
}


public class Aufgabe_6_3 {

	public static void main(String[] args) {
		NamedPoint p1 = new NamedPoint(5,5,"Objekt1");
		NamedPoint p2 = new NamedPoint(2,3,"Objekt2");
		NamedPoint p3 = new NamedPoint(7,8);
		System.out.println(p3.getStatus());
		System.out.println(p1.getStatus());
		System.out.println(p2.getStatus());
		p1.subtract(p2);
		System.out.println(p1.getStatus());
		p1.add(p2);
		System.out.println(p1.getStatus());
		System.out.println(p2.getPoint().toString());
		
	}

}
