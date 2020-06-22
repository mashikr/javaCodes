package javaLab;

public class QuadrilateteralTest {
	public static void main(String args[]) {
		//Quadrilateral1 quad;
		//Trapezoid trap=new Trapezoid(new Point(x:5,y:10),new Point(x:10,y:10),new Point(x:5,y:2),new Point(x:15,y:2),height:8);
	}
}
class Point{
	private double x;
	private double y;
	
	Point(double x, double y){
		this.x=x;
		this.y=y;
	}
	public double getX() {return x;}
	public double getY() {return y;}
}

abstract class Quadrilateral1{
	protected Point p1;
	protected Point p2;
	protected Point p3;
	protected Point p4;
	
	Quadrilateral1(Point p1, Point p2, Point p3, Point p4){
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
		this.p4=p4;
	}
	abstract double area();
	public void print() {
		System.out.println("The area of "+this.getClass().getSimpleName()+" is: "+area());
	}
}
class Trapezoid extends Quadrilateral1{
	double height;
	Trapezoid(Point p1, Point p2, Point p3, Point p4, double height) {
		super(p1, p2, p3, p4);
		this.height=height;
	}
	
	double a=p2.getX()-p1.getX();
	double b=p4.getX()-p3.getX();
	public double area() {
		return 0.5*(a+b)*height;
	}
}

class Parallelogram1 extends Quadrilateral1{
	Parallelogram1(Point p1, Point p2, Point p3, Point p4){
		super(p1, p2, p3, p4);
	}
	double a=p2.getX()-p1.getX();
	double b=p4.getX()-p3.getX();
	public double area() {
		return a*b;
	}
}

class Rectangle1 extends Quadrilateral1{
	Rectangle1(Point p1, Point p2, Point p3, Point p4){
		super(p1, p2, p3, p4);
	}
	double a=p2.getX()-p1.getX();
	double b=p1.getY()-p3.getY();
	public double area() {
		return a*b;
	}
}

class Square1 extends Quadrilateral1{
	Square1(Point p1, Point p2, Point p3, Point p4){
		super(p1, p2, p3, p4);
	}
	double a=p2.getX()-p1.getX();
	public double area() {
		return a*a;
	}
}