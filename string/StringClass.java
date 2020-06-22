package string;

public class StringClass {
	public static void main(String args[])
	{
		char helloArr[] = {'h','e','l','l','o','.'};
		String hello = new String(helloArr);
		String hello2 = "Hello 2.";
		
		System.out.println(hello2);
		System.out.println(hello);
		
		int len = hello.length();
		System.out.println(len);
		
		String hello3=hello.concat(hello2);
		System.out.println(hello3);
		System.out.println("hello. "+hello2);
	}
}
