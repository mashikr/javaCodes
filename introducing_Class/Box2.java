package introducing_Class;

public class Box2 {
int a,b;
	
	Box2(int i, int j){
		a = i;
		b = j;
	}
	
	boolean equalTo(Box2 o) {
		if(o.a == a && o.b == b) return true;
		else return false;
	}
}

class Passob{
	public static void main(String args []) {
		Box2 ob1 = new Box2(100, 22);
		Box2 ob2 = new Box2(100, 22);
		Box2 ob3 = new Box2(-1, -1);
		
		System.out.println("ob1 == ob2: " + ob1.equalTo(ob2));
		System.out.println("ob1 == ob3: " + ob1.equalTo(ob3));
	}
}
