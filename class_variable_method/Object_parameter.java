package class_variable_method;

public class Object_parameter {
	int a,b;
	
	Object_parameter(int i, int j){
		a = i;
		b = j;
	}
	
	boolean equalTo(Object_parameter o) {
		if(o.a == a && o.b == b)
			return true;
		else return false;
	}
}


