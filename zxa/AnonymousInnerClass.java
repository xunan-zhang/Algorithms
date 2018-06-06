package zxa;

abstract class Person {
	abstract void eat();
}

//The new operator
//The name of an interface to implement or a class to extend
//Parentheses that contain the arguments to a constructor ()
//A body with {}
class AnonymousInnerClass {
	public static void main(String args[]) {
		double d = 2.3;
		Byte b = 2;
		double dd;
		dd = (double)b;
		System.out.println(dd);
		
		Person p = new Person() {
			void eat() {
				System.out.println("nice fruits");
			}
		};
		p.eat();
	}
}