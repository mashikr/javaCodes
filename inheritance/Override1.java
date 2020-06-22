package inheritance;
class A1{
	int i, j;
	
	A1(int a, int b){
		i = a;
		j = b;
	}
	
	void show() {
		System.out.println("i and j: " + i +"  " + j);
	}
}

class B1 extends A1{
	int k;
	
	B1(int a, int b, int c){
		super(a, b);
		k = c;
	}
	
	void show(String msg) {
		System.out.println(msg + k);
	}
}
public class Override1 {
	public static void main(String args[]) {
		B1 ob = new B1(1, 2, 3);
		
		ob.show("This is k: ");
		ob.show();
	} 
}
