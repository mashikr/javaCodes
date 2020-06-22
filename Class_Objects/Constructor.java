package Class_Objects;

public class Constructor {
	double width;
	double height;
	double depth;
	
	Constructor(double w, double h, double d){
		width=w;
		height=h;
		depth=d;
	}
	
	double volumn() {
		return width*height*depth;
	}
	

}

