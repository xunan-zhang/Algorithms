//save by B.java  
package mypack;

class A {
	void msg() {
		System.out.println("Hello java, A");
	}
}

public class B extends A {
	void msg() {
		System.out.println("Hello java, B");
	}// C.T.Error

	public static void main(String args[]) {
		A obj = new B();
		obj.msg();
	}
}