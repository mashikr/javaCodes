package class_variable_method;

public class Passob {
	public static void main(String args []) {
		Object_parameter ob1 = new Object_parameter(100, 22);
		Object_parameter ob2 = new Object_parameter(100, 22);
		Object_parameter ob3 = new Object_parameter(-1, -1);
		
		System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
		System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
	}
}
