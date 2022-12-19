package com.home_work_5_OOP_1_pract;

public class Point 
{
	private int x;
	private int y;

	public Point()
	{
		
	}
	public Point(int x)
	{
		this.x = x;
	}
	public int getX()
	{
		return x;
	}
	public void setX(int x)
	{
		this.x = x;
	}
	public int getY()
	{
		return y;
	}
	public void setY(int y)
	{
		this.y = y;
	}

	protected String print()
	{
		return "X: " + getX() + "\tY: " + getY();
	}
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

}