package javaLab;

abstract class Quadrilateral{
	double x1; 
	double y1;
	double x2;
	double y2;
	double x3;
	double y3;
	double x4;
	double y4;
	
	Quadrilateral(double X1,double Y1,double X2,double Y2,double X3,double Y3,double X4,double Y4){
		x1=X1;
		y1=Y1;
		x2=X2;
		y2=Y2;
		x3=X3;
		y3=Y3;
		x4=X4;
		y4=Y4;
	}
	abstract double area();
}
/*
class Trapezoid extends Quadrilateral{
	Trapezoid(double X1,double Y1,double X2,double Y2,double X3,double Y3,double X4,double Y4){
		super(X1, Y1, X2, Y2, X3, Y3, X4, Y4);
	}
	
	double area() {
		
	}
}
*/
class Parallelogram extends Quadrilateral{
	Parallelogram(double X1,double Y1,double X2,double Y2,double X3,double Y3,double X4,double Y4){
		super(X1, Y1, X2, Y2, X3, Y3, X4, Y4);
	}
	
	double area() {
		double x=Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
		double y=Math.sqrt(Math.pow(x3-x2, 2)+ Math.pow(y3-y2, 2));
		return x*y;
	}
}

class Rectangle extends Quadrilateral{
	Rectangle(double X1,double Y1,double X2,double Y2,double X3,double Y3,double X4,double Y4){
		super(X1, Y1, X2, Y2, X3, Y3, X4, Y4);
	}
	
	double area() {
		double x=Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
		double y=Math.sqrt(Math.pow(x3-x2, 2)+ Math.pow(y3-y2, 2));
		return x*y;
	}
}

class Square extends Quadrilateral{
	Square(double X1,double Y1,double X2,double Y2,double X3,double Y3,double X4,double Y4){
		super(X1, Y1, X2, Y2, X3, Y3, X4, Y4);
	}
	
	double area() {
		double x=Math.sqrt(Math.pow(x2-x1, 2)+ Math.pow(y2-y1, 2));
		return x*x;
	}
}

public class Hierarchy14 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle(0,0,-10,0,-10,5,0,5);
		Square sq = new Square(0,0,0,5,5,5,0,5);
		Quadrilateral qu;
		
		qu = r;
		System.out.println("Rectangle area is: "+ qu.area());
		qu = sq;
		System.out.println("Square area is: "+ qu.area());
	}
}
