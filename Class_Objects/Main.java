package Class_Objects;

public  class Main{
	public static void main(String[] args) {
		Constructor mybox1=new Constructor(10,20,15);
		Constructor mybox2=new Constructor(3,6,9);
		
		double vol;
		
		vol=mybox1.volumn();
		System.out.println("Volumn is "+vol);
		
		vol=mybox2.volumn();
		System.out.println("Volumn is "+vol);
	}
}
