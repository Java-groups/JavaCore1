package com.home_work_5_OOP_1_pract;

public class Line 
{

	private Point point_1;
	private Point point_2;

	Line()
	{
		point_1 = new Point();
		point_2 = new Point();
	}

	public int getX_1()
	{
		return point_1.getX();
	}

	public void setX_1(int x)
	{
		this.point_1.setX(x);
	}

	public int getX_2()
	{
		return point_2.getX();
	}

	public void setX_2(int x)
	{
		this.point_2.setX(x);
	}

	public int getY_1()
	{
		return point_1.getY();
	}

	public void setY_1(int y)
	{
		this.point_1.setY(y);
	}

	public int getY_2()
	{
		return point_2.getY();
	}

	public void setY_2(int y)
	{
		this.point_2.setY(y);
	}

	protected String print()
	{
		return "X1: " + point_1.getX() + "\tY1: " + point_1.getY() + "\tX2: " + point_2.getX() + "\tY2: " + point_2.getY() + ";";
	}

	@Override
	public String toString() {
		return "Line [point_1 X: " + point_1.getX() + ", point_1 Y: " + point_1.getY() + ", point_2 X: " + point_2.getX() + ", point_2 Y: " + point_2.getY() + "]";
	}

}